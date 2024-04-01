public class Funciones1 {
    public static void main(String[] args) {
        /*
         * Funciones: una porcion de codigo que realiza
         * una tarea especifica.
         * 
         */
        System.out.println("Ingrese un número positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        if (esPrimo(n)) {
            System.out.println("El " + n + " es primo");
        } else {
            System.out.println("El " + n + " no es primo");
        }
    }

    public static boolean esPrimo(int n){
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
