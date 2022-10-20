import java.util.Scanner;

public class EightPositiveNumber {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = reader.nextInt();

        while (num > 0) {
            sum += num;
            num--;
        }

        System.out.printf("Resultado: %d", sum);
    }
}
