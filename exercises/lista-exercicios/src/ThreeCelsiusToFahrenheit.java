import java.util.Scanner;

public class ThreeCelsiusToFahrenheit {
    public static void main(String[] args) {
        int temp1, temp2;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe uma temperatura em graus Celsius para ser convertida em Fahrenheit: ");
        temp1 = reader.nextInt();

        System.out.print("Informe outra temperatura em graus Celsius para ser convertida em Fahrenheit: ");
        temp2 = reader.nextInt();

        System.out.printf("Temperatura 1 %dºC são %dºF\n", temp1, celsiusToFahrenheitConverter(temp1));
        System.out.printf("Temperatura 2 %dºC são %dºF", temp2, celsiusToFahrenheitConverter(temp2));
    }

    public static int celsiusToFahrenheitConverter(int temp) {
        double factor1 = 1.8, factor2 = 32;

        return (int) ((temp * factor1) + factor2);
    }
}
