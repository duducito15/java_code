public class NumerosAleatorios {
    public static void main(String[] args) {
        /* Numeros aleatorios me sirven para emular el comportamiento
        de un fenomeno, el resultado juegos de azar o cualquier valor

        Generacion de un numero aleatorio:
         con decimales: son numeros de tipo double
         sin decimales: son numeros de tipo int

        */

/*         System.out.println("Diez Numeros aleatorios con decimal");
        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random());
        } */
        System.out.println("Diez Numeros aleatorios con enteros");
        for (int i = 1; i < 11; i++) {
            System.out.println((int)(Math.random()*20+1));
        }
    }
}
