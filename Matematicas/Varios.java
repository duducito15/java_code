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
}
