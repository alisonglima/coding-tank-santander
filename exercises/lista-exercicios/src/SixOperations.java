import java.util.Scanner;

public class SixOperations {
    public static void main(String[] args) {
        char operation;
        int num1, num2, result = 0;
        Scanner reader = new Scanner(System.in);

        System.out.print("Qual operação deseja fazer? ( opções: + - / * ): ");
        operation = reader.next().charAt(0);

        if(operation != '+' && operation != '-' && operation != '/' && operation != '*') {
            System.out.printf("Operação %s desconhecida.", operation);
            return;
        }

        System.out.print("Informe o primeiro número: ");
        num1 = reader.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = reader.nextInt();

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        System.out.printf("O resultado da operação %d %s %d é: %d.", num1, operation, num2, result);
    }
}
