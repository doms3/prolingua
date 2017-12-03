package prolingua;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class XProlinguaConverter {

	public static String convertToEnglProlingua(String fileName) throws FileNotFoundException {
		
		
		// to return this string
		String engl = "";
		// to keep spacing between lines
		String spacing = "";

		Scanner sc = new Scanner(new FileInputStream(fileName));

		// check entire document, will take each line as a string, keeping spacing
		while (sc.hasNextLine()) {

			String currentLine = sc.nextLine();

			// eliminate and count the indents
			while (currentLine.startsWith("\t")) {
				currentLine = currentLine.substring(1, currentLine.length());
				engl += "\t";
			}

			// analyze each word
			String[] words = currentLine.split("[\\s]");

			boolean bracket = false;
			boolean hardCode = false;
			
			// will return the English translation
			for (String word : words) {
				String nextWord = JsonConverter.getInstance().getTranslation(word) ;
				
				//This section checks for brackets, which will not translate
				if(nextWord.startsWith("(\"")) {
					bracket = true;
					engl += nextWord + " ";
				}
				else if((bracket)&&(nextWord.endsWith("\")"))) {
					bracket = false;
					engl += nextWord + " ";
				}
				else if (bracket) {
					engl += nextWord + " ";
				}
				
				//This section checks for the "is not"/"no es" conversion
				// which should be ignored if in brackets
				else {
					
					if((hardCode)&&(nextWord.equals("is"))){
						engl += "is not ";
						hardCode = false;
					}
					else if( (hardCode)&&(!(nextWord.equals("is")))) {
						engl += "not " + nextWord + " ";
					}
					else if ((!hardCode)&&(nextWord.equals("not"))) {
						hardCode = true;
					}
					else if(!hardCode){
						engl += nextWord + " ";
					}
				}
			}
			engl += "\n";
		}
		return engl;
	}
	
	
	public static void main(String [] args) throws FileNotFoundException {
		XProlinguaConverter x = new XProlinguaConverter(); 
		System.out.println(x.convertToEnglProlingua("spanish_example"));
	}

}
