public class Calculadora {

    public boolean esPrimo(int num){
        if(num == 0 || num == 4) {
            return false;
        }
        for (int x = 2; x<num/2;x++){
            if (num%x==0){
                return false;
            }
        }
        return true;
    }
}
