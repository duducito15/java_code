import Matematicas.*;
 
public class Funciones1 {
    public static void main(String[] args) {
        /*
         * Funciones: una porcion de codigo que realiza
         * una tarea especifica.
         * 
         */
        System.out.println("Ingrese un número positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        if (Matematicas.Varios.esPrimo(n)) {
            System.out.println("El " + n + " es primo");
        } else {
            System.out.println("El " + n + " no es primo");
        }

        if (Matematicas.Varios.esCapicua(n)) {
            System.out.println("El " + n + ", si es capicua");
        } else {
            System.out.println("El " + n + ", no es capicua");
        }


    } 
}
