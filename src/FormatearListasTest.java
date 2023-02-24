import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FormatearListasTest {
    FormatearListas fl = new FormatearListas();
    @Test
    public void Test_Listas(){
        assertEquals("lista completa","uno,dos y tres",fl.formatear(new String[]{"uno","dos","tres"}));
        assertEquals("lista vacia","",fl.formatear(new String[]{""}));
        assertEquals("falta el tercero","uno y dos",fl.formatear(new String[]{"uno","dos"}));
        assertEquals("falta el primero","dos y tres",fl.formatear(new String[]{"","dos","tres"}));
        assertEquals("solo el primero","uno",fl.formatear(new String[]{"uno"}));
    }
}