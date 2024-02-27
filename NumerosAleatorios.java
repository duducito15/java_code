public class NumerosAleatorios {
    public static void main(String[] args) {
        /*
         * Numeros aleatorios me sirven para emular el comportamiento
         * de un fenomeno, el resultado juegos de azar o cualquier valor
         * 
         * Generacion de un numero aleatorio:
         * con decimales: son numeros de tipo double
         * sin decimales: son numeros de tipo int
         * 
         */

        /*
         * System.out.println("Diez Numeros aleatorios con decimal");
         * for (int i = 1; i < 11; i++) {
         * System.out.println(Math.random());
         * }
         */
        /*
         * System.out.println("Diez Numeros aleatorios con enteros");
         * for (int i = 1; i < 11; i++) {
         * System.out.println((int)(Math.random()*(20-14))+15);
         * }
         */

        /*
         * Ejercicio 1: Escribe un programa que muestre la tirada de tres dados.
         * Se debe mostrar la suma total (los puntos que suman entre los tres dados)
         * 
         * Ejercicio 2: Muestra 50 numeros enteros aleatorios entre 100 y 199
         * (ambos incluidos) separados por espacios. Muestre tambien el Maximo,
         * el minimo y la media.
         * 
         */
        System.out.println("Genera al azar piedra, papel o tijera");
        int mano = (int) (Math.random() * 3); // del 0 y 2
        switch (mano) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
                break;
        }

    }
}
