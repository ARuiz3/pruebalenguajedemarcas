import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;

public class AppTest2 {
    private final InputStream stdIn = System.in;
    private final PrintStream stdOut = System.out;

    private ByteArrayInputStream simularTeclado = null;
    private ByteArrayOutputStream capturadorSalida = new ByteArrayOutputStream();

    App app = new App();

    @BeforeTest
    public void setUp() {
        System.setOut(new PrintStream(capturadorSalida));
        System.setIn(stdIn);
    }
    private void provideInput(String data){
        simularTeclado = new ByteArrayInputStream(data.getBytes());
        System.setIn(simularTeclado);
    }

    @Test
    public void test_saludo() {
        app.saludar();

        Assert.assertEquals("Hola mundo", capturadorSalida.toString().trim());
    }
    @Test
    public void test_valido_calculardias(){
        provideInput("2022\n02\n24");
        app.nacimiento();
        Assert.assertEquals(capturadorSalida.toString().trim(),"365");
    }
    @Test
    public void test_fechaContieneCaracteres_calculardias(){
        provideInput("ea\n02\n24");
        Assert.assertThrows(DateTimeParseException.class,() -> app.nacimiento());
    }
    @Test
    public void test_saludarMalInsertado_saludar(){
        provideInput("hola");
        Assert.assertThrows(InputMismatchException.class,() -> app.saludar());
    }
    @Test
    public void test_fechaTieneVacios_calculardias(){
        provideInput("\n02\n24");
        Assert.assertThrows(DateTimeParseException.class,() -> app.nacimiento());
    }

    @AfterTest
    public void tearDown() {
        System.setIn(stdIn);
        System.setOut(stdOut);
    }
}
