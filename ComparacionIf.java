public class ComparacionIf {
    public static void main(String[] args) {
        /*
         * Sentecia condicional, permitir al programa bifurcar
         * el flujo de la ejecuión del programa dependiendo
         * de una condicion (verdad o falso).
         * 
         * Sentecia if
         * 
         * if(condicion){
         *    instruciones a ejecutar si la condicion es verdadera
         * }else{
         *    instruciones a ejecutar si la condicion es falsa
         * }
         * 
         */

         String miFruta = "naranja";

         if (miFruta == "naranja") {
            System.out.println("Que rica fruta, me la como!!!");
         }else{
            System.out.println("No puedo comer esa fruta!!!");
         }

         //Programa que indique cual es la capital de Perú

         String capital = "Arequipa";
         if (capital == "Lima") {
            System.out.println("Es correcto, "+ capital +" es capital de Perú!!!"); 
         }else{
            System.out.println("NO!!!!, "+ capital +" no es capital de Perú!!!");
         }
    }
}
