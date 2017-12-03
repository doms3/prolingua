package prolingua;

import java.io.*;
import java.util.Scanner;

public class Prolingua {
    public static void main(String... args) throws IOException {
        String language;
        if (args.length==0){
            language="english";
        }
        else {
            language=args[0].trim();
        }
        translate(language);
    }
    public static void translate(String language) throws IOException {
        String input;
        if (language.equals("english")) {
            Scanner sc = new Scanner(new FileInputStream("prolinguaCode.txt"));

            // check entire document, will take each line as a string, keeping spacing
            StringBuilder collected = new StringBuilder("");
            while (sc.hasNextLine()) {

                String currentLine = sc.nextLine();
                collected.append(currentLine+"\n");

            }
            input=collected.toString();
        }
        else {
           input = readProlingua("prolinguaCode.txt", language);
        }
        writeProlingua(input, "yourCode.py");
    }

    public static String readProlingua(String inputFileName, String language) throws FileNotFoundException {
        return XProlinguaConverter.convertToEnglProlingua(inputFileName);
    }
    public static void writeProlingua(String prolinguaInput, String outputFile) throws IOException {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(outputFile)));
        writer.write(new PythonInterpreter(prolinguaInput).getPython());
        writer.close();
    }
}
