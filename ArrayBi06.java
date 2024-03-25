public class ArrayBi06 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que muestre en pantalla un array de 10 filas por
         * 10 columnas relleno con numeros aleatorios entre 200 y 300. A
         * continuacion el programa debe mostrar los numeros de la diagonal que va desde
         * la esquina superior izquierda a la esquina inferior derecha, asi
         * como el maximo, el minimo y la media de los numeros que hay en la
         * diagonal.
         */
        // 1. Declaramos nuestro array bidimencional
        int[][] matriz = new int[10][10];
        int[] diagonalPrincipal = new int[10];
        int[] diagonalSecundaria = new int[10];
        // 2. rellenar con numeros aleatorios
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                matriz[filas][columnas] = (int) (Math.random() * 101) + 200;
                //Determinando los elemntos de la diagonal
                if (filas == columnas) {
                    diagonalPrincipal[filas] = matriz[filas][columnas];
                }
                //Determinando los elementos de la diagonal secundaria
                if (filas+columnas == 10 - 1) {
                    diagonalSecundaria[filas] = matriz[filas][columnas];
                }

                System.out.printf("%5d", matriz[filas][columnas]);
            }
            System.out.println();
        }
        System.out.println("Diagonal secundaria");
        for (int i = 0; i < diagonalSecundaria.length; i++) {
            System.out.printf("%5d", diagonalSecundaria[i]);
        }

        int mayor = 200;
        int menor = 300;
        int suma = 0;
        System.out.println("\nDiagonal principal");
        for (int i = 0; i < diagonalPrincipal.length; i++) {
            System.out.printf("%5d", diagonalPrincipal[i]);
            if (diagonalPrincipal[i] > mayor) {
                mayor = diagonalPrincipal[i];
            }
            if (diagonalPrincipal[i] < menor) {
                menor = diagonalPrincipal[i];
            }
            suma = suma + diagonalPrincipal[i];
        }
        System.out.println("\nMayor: "+mayor);
        System.out.println("Menor: "+menor);
        System.out.println("Promedio: "+((double)suma/10));
    }
}
