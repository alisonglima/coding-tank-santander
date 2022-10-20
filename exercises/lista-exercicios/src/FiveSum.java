import java.util.Scanner;

public class FiveSum {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner reader = new Scanner(System.in);

        if (args.length > 2) {
            System.out.printf("Número inválido de argumentos.", args.length);
            return;
        }

        if (args.length == 1) num1 = Integer.parseInt(args[0]);
        if (args.length == 2) num2 = Integer.parseInt(args[1]);

        if(num1 == 0) {
            System.out.print("Informe um número para realizar a soma: ");
            num1 = reader.nextInt();
        }

        if(num2 == 0) {
            System.out.print("Informe um segundo número para realizar a soma: ");
            num2 = reader.nextInt();
        }

        System.out.printf("\nA soma de %d e %d é %d", num1, num2, num1 + num2);
    }
}
