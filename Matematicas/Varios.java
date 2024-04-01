package Matematicas;

public class Varios {
    // Retorna si un numero es primo o no
    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    //Funcion que retorne si un numero es capicua
    public static boolean esCapicua(int n){
        int original = n;
        int inverso = 0;

        while (n > 0) {
            int digito = n % 10;
            inverso = inverso * 10 + digito;
            n = n / 10;
        }
        return original == inverso;
    }
     //Funcion que devuelva el siguiente numero primo,del numero que pasamos como parametro

}
