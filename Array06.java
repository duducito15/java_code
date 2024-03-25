import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que sea capaz de ordenar un array de una
         * dimension, que contenga 20 numeros enteros aleatorios entre 0 y 200
         */
        int[] numeros = new int[10];
        // LLenamos el arreglo
        System.out.println("\nArray No Ordenado");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 201);
            System.out.print(numeros[i] + "\t");
        }
       
        // Ordenamiento
        System.out.println("\nArray Ordenado");
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
        

    }
}
