package prolingua;

import java.io.FileInputStream;
import java.io.IOException;

import generatedcode.ProlinguaLexer;
import generatedcode.ProlinguaParser;

import org.antlr.v4.gui.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class AntlrTester {
	
	public void viewTree( String file ) throws IOException{
		String english = XProlinguaConverter.convertToEnglProlingua( file );
		CharStream stream = CharStreams.fromString( english );
		ProlinguaLexer lexer = new ProlinguaLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		ProlinguaParser parser = new ProlinguaParser(tokens);
		ParseTree tree = parser.program();

		Trees.inspect(tree, parser);
	}
	
	public static void main ( String [] args ) throws IOException {
		AntlrTester a = new AntlrTester();
		a.viewTree("spanish_example.txt");
	}
}
