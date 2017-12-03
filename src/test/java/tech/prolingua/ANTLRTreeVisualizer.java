package tech.prolingua;

import java.io.*;

import generatedcode.ProlinguaLexer;
import generatedcode.ProlinguaParser;

import org.antlr.v4.gui.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ANTLRTreeVisualizer {
	
	public static void viewSpanishTree( File in ) throws IOException {
		String english = EnglishLanguageConverter.convert( in, "spanish" );
        viewEnglishTree( new ByteArrayInputStream( english.getBytes() ) );
	}

	public static void viewEnglishTree( InputStream in ) throws IOException {
		CharStream stream = CharStreams.fromStream( in );
		ProlinguaLexer lexer = new ProlinguaLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		ProlinguaParser parser = new ProlinguaParser(tokens);
		ParseTree tree = parser.program();

		Trees.inspect(tree, parser);
	}
	
	public static void main ( String[] args ) throws IOException {
		File f = new File( "spanish_example.txt" );
		ANTLRTreeVisualizer.viewSpanishTree( f );
	}
}
