package tech.prolingua;


import org.junit.Test;

public class TestHelp {

    @Test
    public void testHelp() {
        String[] args = { "--help" };
        Prolingua.main( args );
    }

    @Test
    public void testTranslate() {
        String[] args = { "-t", "spanish_example.pro", "spanish" };
        Prolingua.main( args );
    }

    @Test
    public void testCompile() {
        String[] args = { "-c", "spanish_example.pro", "spanish" };
        Prolingua.main( args );
    }

}
