package prolingua;

import generatedcode.ProlinguaBaseListener;
import generatedcode.ProlinguaLexer;
import generatedcode.ProlinguaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;

public class PythonInterpreter extends ProlinguaBaseListener {

    private final StringBuilder python;
    private final ProlinguaParser.ProgramContext tree;

    PythonInterpreter( InputStream i ) throws IOException {
        CharStream stream = CharStreams.fromStream(i);
        ProlinguaLexer lexer = new ProlinguaLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ProlinguaParser parser = new ProlinguaParser(tokens);

        tree = parser.program();

        python = new StringBuilder();
    }

    PythonInterpreter( String s ) throws IOException {
        CharStream stream = CharStreams.fromString( s );
        ProlinguaLexer lexer = new ProlinguaLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ProlinguaParser parser = new ProlinguaParser(tokens);

        tree = parser.program();

        python = new StringBuilder();
    }

    public void enterLine(ProlinguaParser.LineContext cxt) {
        cxt.TAB().forEach(r -> python.append("\t"));
        if( cxt.expression() != null ) {
            python.append( cxt.expression().getText() );
        }
    }

    public void exitLine(ProlinguaParser.LineContext cxt) {
        python.append("\n");
    }

    public void enterElifstatement(ProlinguaParser.ElifstatementContext cxt) {
        python.append("el");
    }

    public void enterIfstatement(ProlinguaParser.IfstatementContext cxt) {
        if( cxt.FALSE() != null ) {
            python.append( String.format( "if not %s:", cxt.VAR(0).getText() ) );
        } else if( cxt.TRUE() != null ) {
            python.append( String.format( "if %s:", cxt.VAR(0).getText() ) );
        } else {
            String s1 = cxt.VAR(0 ).getText();
            String s2;
            s2 = cxt.NUM() != null ? cxt.NUM().getText() : cxt.VAR(1 ).getText();
            if( cxt.LOGIC().getText().equals( "is" ) ) {
                python.append( String.format( "if %s == %s:", s1, s2 ) );
            } else {
                python.append( String.format( "if %s != %s:", s1, s2 ) );
            }
        }
    }

    public void enterElsestatement(ProlinguaParser.ElsestatementContext cxt ) {
        python.append( "else:" );
    }

    public void enterWhilestatement(ProlinguaParser.WhilestatementContext cxt ) {
        if( cxt.FALSE() != null ) {
            python.append( String.format( "while not %s:", cxt.VAR(0).getText() ) );
        } else if( cxt.TRUE() != null ) {
            python.append( String.format( "while %s:", cxt.VAR(0).getText() ) );
        } else {
            String s1 = cxt.VAR(0 ).getText();
            String s2;
            s2 = cxt.NUM() != null ? cxt.NUM().getText() : cxt.VAR(1 ).getText();
            if( cxt.LOGIC().getText().equals( "is" ) ) {
                python.append( String.format( "while %s == %s:", s1, s2 ) );
            } else {
                python.append( String.format( "while %s != %s:", s1, s2 ) );
            }
        }
    }

    public void enterPrintstatement(ProlinguaParser.PrintstatementContext cxt ) {
        python.append( String.format("print( %s )", cxt.getChild(1).getText()) );
    }

    public void enterAssignstatement(ProlinguaParser.AssignstatementContext cxt) {
        if( cxt.FALSEPRIME() != null ) {
            python.append( String.format("%s = %s", cxt.VAR(), cxt.FALSEPRIME().getText() ) );
        } else if( cxt.TRUEPRIME() != null ) {
            python.append( String.format("%s = %s", cxt.VAR(), cxt.TRUEPRIME().getText() ) );
        } else {
            python.append(String.format("%s = %s", cxt.VAR(), cxt.expression().getText()));
        }
    }

    public void enterForstatement(ProlinguaParser.ForstatementContext cxt ) {
        if( cxt.RANGE() != null ) {
            String[] nums = cxt.RANGE().getText().split(":");
            python.append( String.format( "for %s in range(%s,%s):", cxt.VAR(0).toString(), nums[0], nums[1] ) );
        } else {
            python.append( String.format( "for %s in %s:", cxt.VAR(0).toString(), cxt.VAR(1).toString() ) );
        }
    }

    public String getPython() {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( this, tree );
        return python.toString();
    }


    public static void main( String[] args ) throws Exception {

        System.out.println( new PythonInterpreter(  XProlinguaConverter.convertToEnglProlingua("spanish_example.txt" ) ).getPython() );
    }


}
