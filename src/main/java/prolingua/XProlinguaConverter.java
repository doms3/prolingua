package prolingua;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class XProlinguaConverter {

	public String convertToEnglProlingua(String xProl) throws FileNotFoundException {
		//to return this string
		String engl = "";
		//to keep spacing between lines
		String spacing = "";
		
		Scanner sc = new Scanner(new FileInputStream(xProl));
		
		//check entire document, will take each line as a string, keeping spacing
		while(sc.hasNextLine()) {

			String currentLine = sc.nextLine();
			
			//eliminate and count the indents
			while(currentLine.startsWith("[\t]")) {
				currentLine = currentLine.substring(1, currentLine.length());
				engl += "\t";
			}
			
			//analyze each word
			String[] words = currentLine.split("[\\s]");
			
			// will return the English translation
			for (String word : words) {
				engl += JsonConverter.getInstance().getTranslation(word) + " ";
			}
			
			engl += "\n";
			
		}
		
		
		
		return engl;
	}
	
}
