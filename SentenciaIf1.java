import java.util.Scanner;

public class SentenciaIf1 {
    public static void main(String[] args) 
    {
        /*
         * OPERADORES DE COMPARACION
         * ==   igualdad    a == b 
         * !=   distinto    a != b
         * <    menor que   a < b
         * >    mayor que   a > b
         * <=   menor o igual que   a <= b
         * >=   mayor o igual que   a >= b
         * 
         * Programa que pida al usuario una nota, si esta nota es mayor que 10.5
         * mostrar un mensaje de ha aprobado y caso contrario que indique que
         * desaprobo el curso.
         */ 
        System.out.print("Ingrese la nota: ");
        Scanner s1 = new Scanner(System.in);
        Double nota = s1.nextDouble();

        if (nota >= 10.5) {
            System.out.println(nota+" APROBADO");
        }else{
            System.out.println(nota+" DESAPROBADO");
        }

    }
}
