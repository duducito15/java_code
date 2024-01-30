import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa tres números, separados por espacio: ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();

        
        double media = (x1 + x2 + x3)/3;
        System.out.println("La media es: "+media);
    }
}
