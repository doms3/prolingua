package prolingua;

import org.antlr.v4.gui.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;


public class AntlrTester {
	
	public void veiwTree(String query) {
		 CharStream stream = CharStreams.fromString( query );
		   QueryMakerLexer lexer = new QueryMakerLexer( stream );
		   TokenStream tokens = new CommonTokenStream( lexer );
		   QueryMakerParser parser = new QueryMakerParser( tokens );
		   ParseTree tree = parser.orExpr();
	}
}
