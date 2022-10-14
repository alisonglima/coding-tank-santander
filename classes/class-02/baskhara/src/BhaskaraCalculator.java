import java.util.Scanner;

public class BhaskaraCalculator {
    public static void main (String args[]) {
        double a, b, c, delta, x1, x2;

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = reader.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = reader.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = reader.nextDouble();

        reader.close();

        if (a == 0)
            System.out.println("Estes valores não formam uma equação de segundo grau");
        else {
            delta = (b * b) - ( 4 * a * c);
            System.out.println("\nO Delta é: " + delta);

            if (delta < 0)
                System.out.println("Não existe raiz real");
            if (delta == 0) {
                System.out.println("Existe uma raiz real");
                x1 = (- b) / (2 * a);
                String x1Format = String.valueOf(x1);
                if (x1Format.contains("0.5")){
                    x1Format = "1/2";
                    System.out.println("\nRaiz = "+x1Format);
                }
            }
            if (delta > 0) {
                System.out.println("\nExistem duas raízes reais\n");
                x1 = (- b + Math.sqrt(delta))/(2 * a);
                x2 = (- b - Math.sqrt(delta))/( 2 * a);
                System.out.println("Primeira raiz = " + x1);
                System.out.println("Segunda raiz = " + x2);
            }
        }
    }
}