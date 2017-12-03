package tech.prolingua;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class Prolingua {
    public static void main( String[] args ) throws IOException {
        if( args.length != 3 ) {
            System.out.println( "This function takes three inputs:\n\r\t(1) An input file path.\n\r\t(2) An output file path.\n\r\t(3) An input language." );
        } else {
            File in = new File( args[0] );
            File out = new File( args[1] );
            translate( in, out, args[2] );
        }
    }

    public static void translate( File in, File out, String language ) throws IOException {
        if ( language.equals( "english" ) ) {
            writeProlinguaToFile( new FileInputStream( in ), out );
        } else {
            String english = readProlinguaFromFile( in, language );
            writeProlinguaToFile( new ByteArrayInputStream( english.getBytes() ), out );
        }
    }

    private static String readProlinguaFromFile( File in, String language ) throws IOException {
        return EnglishLanguageConverter.convert( in, language );
    }

    private static void writeProlinguaToFile( InputStream in, File out ) throws IOException {
        try ( PrintWriter writer = new PrintWriter( new OutputStreamWriter( new FileOutputStream( out ) ) ) ) {
            writer.write(new PythonInterpreter(in).getPython());
        }
    }
}
