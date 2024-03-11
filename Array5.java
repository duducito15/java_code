public class Array5 {
    public static void main(String[] args) {
        //REALICE UN PROGRAMA QUE GENERE 8 NUMEROS ENTEROS ALEATORIOS Y QUE LUEGO MUESTRE ESOS NUMEROS JUNTO
        //A LA PALABRA PAR O IMPAR SEGUN CORRESPONDA.
        int[] numeros = new int[8];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*51);
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " par");
            } else {
                System.out.println(numeros[i] + " impar");
            }
            
        }
        /*
         * Escribe un programa que llene un array de 100 elementos con numeros enteros aleatorios entre 0 y 500
         * A continuacion el programa mostrara el array y preguntara al usuairo si quiere destacar el maximo
         * o minimo, seguidamente se volvera a mostrar el array escrbiendo el numero destacad entre dobles asteriscos
         * 
         *  **1**
         *  **480**
         */
    }
}
