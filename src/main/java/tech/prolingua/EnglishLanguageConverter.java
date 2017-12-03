package tech.prolingua;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class EnglishLanguageConverter {

	public static String convert( File in, String language ) throws FileNotFoundException, IOException {
		List<String> lines = Files.readAllLines( in.toPath() );
		String allLines = "";
		for ( String line : lines ) {
			allLines = allLines + "\n\r" + line;
		}
		return convert( allLines, language );
	}

	public static String convert( String in, String language ) throws FileNotFoundException {
		TreeMap<String, String> cases = new TreeMap<>();
		JsonObject translations = Json.createReader( new FileInputStream( "language_support/" + language + "/converter.json" ) ).readObject();
		translations.forEach( ( r, s ) -> cases.put( s.toString().replaceAll("\"", "" ), r ) );

		Iterator<String> iter = cases.navigableKeySet().descendingIterator();

		while( iter.hasNext() ) {
			String s = iter.next();
			List<String> delims = Arrays.asList( " ", "\n\r", "\t" );
			for (String s1 : delims) {
				for (String s2 : delims) {
					in = in.replaceAll(s1 + s + s2, s1 + cases.get(s) + s2 );
				}
			}
		}

		in = in.trim();
		return in;
	}
	
	
	public static void main( String[] args ) throws IOException {
	    File file = new File( "language_support/spanish/spanish_example.txt" );
		System.out.println( convert( file, "spanish" ) );
	}

}
