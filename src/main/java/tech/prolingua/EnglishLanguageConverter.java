package tech.prolingua;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class EnglishLanguageConverter {

	static String convert( String in, String language ) throws IOException {
		TreeMap<String, String> cases = new TreeMap<>();
		InputStream myStream = (EnglishLanguageConverter.class).getResource( "/" + language + "/converter.json" ).openStream();
		JsonObject translations = Json.createReader( myStream ).readObject();
		translations.forEach( ( r, s ) -> cases.put( s.toString().replaceAll("\"", "" ), r ) );

		Iterator<String> iter = cases.navigableKeySet().descendingIterator();
		String ls = System.getProperty( "line.separator" );

		in = ls + in;

		List<String> delims = Arrays.asList( " ", ls, "\t" );
		while( iter.hasNext() ) {
			String s = iter.next();
			for (String s1 : delims) {
				for (String s2 : delims) {
					in = in.replaceAll(s1 + s + s2 + "(?=[^\"]*(?:\"[^\"]*\"[^\"]*)*$)", s1 + cases.get(s) + s2 );
				}
			}
		}

		in = in.trim();
		return in;
	}
}
