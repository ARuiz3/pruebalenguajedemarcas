import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FormatearListas {

    public String formatear(String[] lista) {
        List<String> list = new LinkedList<String>(Arrays.asList(lista));
        list.removeAll(Arrays.asList("", null));
        String result = "";
        if (list.size() > 0) {
            result = list.get(0);
        }
        for (int i = 1; i < list.size() - 1; i++) {
            result += "," + list.get(i);
        }
        if (list.size() > 1) {
            result += " y " + list.get(list.size() - 1);
        }
        return result;
    }
}
