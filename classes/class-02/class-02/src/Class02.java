import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite um número: ");

        var number = reader.nextInt();

        if(number == 0) {
            System.out.print("O número é zero.");
            return;
        }

        var signalType = number > 0 ? "positivo" : "negativo";
        var type = number % 2 == 0 ? "par" : "ímpar";

        System.out.print("O número " + number + " é " + signalType + " e " + type + ".");
    }
}
