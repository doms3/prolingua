package tech.prolingua;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Prolingua {
    public static void main( String[] args ) {
        final List<String> flags = Arrays.asList( "-t", "-c", "--help" );
        final String invalidInput = "Invalid input. Please use the --help flag to see options.";
        final List<String> supportedLanguages = Arrays.asList( "english", "spanish" );

        if( args.length == 0 || !flags.contains( args[0] ) ) {
            System.err.println( invalidInput );
            System.exit( 1 );
        } else if( "--help".equals( args[0] ) ) {
            if( args.length > 1 ) {
                System.err.println( invalidInput );
                System.exit( 1 );
            } else {
                System.out.print(
                        "Welcome to the prolingua compiler, please use one of the following flags:\n\r\t" +
                        "(1) The \"-t\" command translates a prolingua file, specified in the first argument, into English while the original language is specified as the second argument.\n\r\t\t" +
                        "Example use: prolingua -t myfile.pro spanish\n\r\t\t" +
                        "This statement will output a file named myfile_eng.pro to the cwd.\n\r\t" +
                        "(2) The \"-c\" command compiles a prolingua file into Python, the input file is provided as the first argument while the original language is specified in second argument.\n\r\t\t" +
                        "This statement will output a file named myfile.py to the cwd.\n\r\t\t" +
                        "Example use: prolingua -t myfile.pro spanish\n\r\t" +
                        "Languages are specified in lower case. Currently supported languages are English and Spanish.\n\t" );
                System.exit( 0 );        
            }
        } else if( args.length != 3 ) {
            System.err.println(invalidInput);
            System.exit( 1 );
        } else if( !supportedLanguages.contains( args[2] ) ) {
            System.err.println( "That language is not supported yet! Please use the \"--help\" flag for more info." );
            System.exit( 1 );
        } else {
            File inFile = new File( args[1] );
            String[] fileParts = inFile.getName().split("\\Q.\\E" );
            if( !"pro".equals( fileParts[fileParts.length - 1] ) ) {
                System.err.println( "Input file must have the .pro extension!" );
                System.exit( 1 );
            } else {
                try {
                    String raw = readFile( inFile );
                    try {
                        String translated = translate( raw, args[2] );
                        try {
                            if ( "-t".equals( args[0] ) ) {
                                String translatedName = fileParts[0] + "_eng.pro";
                                writeToFile( translated, translatedName );
                            } else {
                                String python = new PythonInterpreter( translated ).getPython();
                                String pythonName = fileParts[0] + ".py";
                                writeToFile( python, pythonName );
                            }
                        } catch ( IOException e2 ) {
                            System.err.println( "Fatal Error: Could not write to output file.");
                            System.exit( 1 );
                        }
                    } catch ( IOException e1 ) {
                        System.err.println( "Fatal Error: Could not find translation encoding for " + args[2] + "." );
                        System.exit( 1 );
                    }
                } catch( IOException e ) {
                    System.err.println( "Fatal Error: Could not read from input file. Does it exist?" );
                    System.exit( 1 );
                }
            }
        }
        System.exit( 0 );
    }

    private static String translate( String in, String language ) throws IOException {
        if ( language.equals( "english" ) ) {
            return in;
        } else {
            return EnglishLanguageConverter.convert( in , language );
        }
    }


    private static void writeToFile( String output, String fileName ) throws IOException {
        File out = new File( fileName );
        try ( PrintWriter writer = new PrintWriter( new OutputStreamWriter( new FileOutputStream( out ) ) ) ) {
            writer.print( output );
        }
    }

    private static String readFile( File in ) throws IOException {
        List<String> lines = Files.readAllLines( in.toPath() );
        if( lines.size() == 0 ) { return ""; }
        StringBuilder allLines = new StringBuilder( lines.get(0) );
        String ls = System.getProperty( "line.separator" );
        for ( int i = 1; i < lines.size(); i++ ) {
            allLines.append( ls + lines.get( i ) );
        }
        return allLines.toString();
    }

}
