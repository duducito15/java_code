public class LecturaTeclado {
    public static void main(String[] args) {
        /*
         * Lectura de texto
         * System.console().readLine().
         * Ojo: todo lo que se lee por teclado es texto para Java
         */
        String nombre;
        System.out.println("Por favor, dime como te llamas: ");
        nombre = System.console().readLine();
        System.out.println("Hola "+ nombre + ", bienvenido!!!");
    }
}
