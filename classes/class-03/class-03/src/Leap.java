import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        int year;
        String result;
        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o ano desejado: ");
        year = reader.nextInt();

        result = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "É Bissexto" : "Não é Bissexto";

        System.out.print(result);
    }
}
