import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int num, result = 1;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe um número: ");
        num = reader.nextInt();

        if(num < 0)
            System.out.println("Não existe fatorial de números negativos");

        for(int i = num; i > 0; i--) {
            result *= i;
        }

        System.out.printf("O fatorial de %d é igual a %d", num, result);
    }
}
