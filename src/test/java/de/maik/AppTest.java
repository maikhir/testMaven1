package de.maik;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final String expected = "Hello World!\n";
    private final String[] args = new String[]{""};


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        assertEquals(2, 2);
    }


    @Test
    public void lookAtConsole() {
        App appUTest = new App();
        appUTest.main(args);
        assertEquals("Test Output", expected, outContent.toString());
    }
}
