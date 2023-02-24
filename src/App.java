import java.time.LocalDate;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class App {
    public void saludar(){
        Scanner lector = new Scanner(System.in);
        int h = lector.nextInt();
        System.out.println(h);
    }
    public void nacimiento(){
        Scanner lector = new Scanner(System.in);
        String anio = lector.nextLine();
        String mes = lector.nextLine();
        String dia = lector.nextLine();
        LocalDate ld = LocalDate.parse(anio + "-" + mes + "-" + dia);

        System.out.println(DAYS.between(ld,LocalDate.now()));
    }
}
