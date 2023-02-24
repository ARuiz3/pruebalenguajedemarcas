
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class AppTest {
    private final PrintStream stdOut = System.out;
    private final ByteArrayOutputStream capturadorSalida = new ByteArrayOutputStream();
    App app = new App();

    @Before
    public void setUp() {
        System.setOut((new PrintStream(capturadorSalida)));
    }

    @Test
    public void test_saludo() {
        app.saludar();
        String actual = capturadorSalida.toString().trim();
        Assert.assertEquals("Hola mundo!", actual);
    }

    @After
    public void tearDown() {
        System.setOut(stdOut);
    }
}

