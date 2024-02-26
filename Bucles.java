public class Bucles {
    public static void main(String[] args) {
        /*
         * Bucles sirven para repetir un conjunto de instrucciones
         * para hacer mas optimo el codigo
         * 
         * FOR: este se utiliza cuando se sabe la cantidad de 
         * repeticiones que  tendra una instruccion
         * 
         * while: repetir un conjunto de instrucciones siempre y cuando cumplan
         * una condicion.
         * 
         * do while:
         * 
         *        */

         System.out.println("Numeros del 1 al 10");
         //for (int i = 1; i <= 10 ; i++) {
           // System.out.println(i);
         //}

  /*     int i = 10; // contador
         while (i >= 1) {
            System.out.println(i);
            i--;
         } */

         int i = 1;
         do {
            System.out.println(i);
            i++;
         } while (i < 11);

        
    }
}
