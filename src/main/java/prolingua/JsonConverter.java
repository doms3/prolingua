package prolingua;

import java.io.*;
import java.util.*;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class JsonConverter {

	
	private static final Set<String> TRANSLATIONS = new HashSet<String>(Arrays.asList(
			"si", "es", "entonces", "o",
			 "mientras", "hacer", "para", "en rango", 
			 "sino", "assignar", "a", "cierto", 
			 "falso", "imprimir", "romper"							));
	private static JsonReader reader;
	private static JsonObject allTranslations;
	private static JsonConverter singleton;
	
	

	
	/**
	 * makes a singleton
	 * @return an instance of JsonConverter
	 * @throws FileNotFoundException from constructor
	 */
	public static JsonConverter getInstance() throws FileNotFoundException {
		if (JsonConverter.singleton == null){
			JsonConverter singleton = new JsonConverter();
			JsonConverter.reader = Json.createReader(new FileInputStream("LanguageConverter.json"));
			allTranslations = JsonConverter.reader.readObject();
			JsonConverter.singleton = singleton;
			return JsonConverter.singleton;
		}
		else return JsonConverter.singleton;
	}
	
	
	/**
	 * 
	 * @param s is not null
	 * @return the english translations of s, else the same word.
	 */
	public static String getTranslation(String s) {
		if (JsonConverter.TRANSLATIONS.contains(s)) {
			return(JsonConverter.allTranslations.getString("s"));
		}
		else return s;
	}
	
	
}
