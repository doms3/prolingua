package prolingua;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.v4.gui.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.prolingua.pythoninterpreter.ProlinguaLexer;
import org.prolingua.pythoninterpreter.ProlinguaParser;


public class AntlrTester {
	
	public void veiwTree(String file) throws IOException{
		FileInputStream f = new FileInputStream(file);
		
		CharStream stream = CharStreams.fromStream(f);
		ProlinguaLexer lexer = new ProlinguaLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		ProlinguaParser parser = new ProlinguaParser(tokens);
		ParseTree tree = parser.program();

		Trees.inspect(tree, parser);
	}
	
	public static void main (String [] args) throws IOException {
		AntlrTester a = new AntlrTester();
		a.veiwTree("src/test/test1.prol");
	}
}
