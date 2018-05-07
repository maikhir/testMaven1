package de.maik;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest123 {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final String[] args = new String[]{""};


    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }


    @After
    public void tearDown() {
        System.setOut(System.out);
    }


    @Test
    public void main() {

        App.main(args);
        String expected = "Hello World!\n";
        assertEquals("Test Output", expected, outContent.toString());
    }
}