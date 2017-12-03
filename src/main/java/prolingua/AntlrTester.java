package prolingua;

import generatedcode.ProlinguaLexer;
import generatedcode.ProlinguaParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;


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
