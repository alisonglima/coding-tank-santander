import java.util.Scanner;

public class SevenInvestiment {
    public static void main(String[] args) {
        Double initialValue, rate, time, interest = 0.0, balance;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe o valor inicial investido em R$: ");
        initialValue = reader.nextDouble();
        balance = initialValue;

        System.out.print("Informe o juros ao mês em %: ");
        rate = reader.nextDouble();

        System.out.print("Informe o tempo em meses que o dinheiro ficará investido: ");
        time = reader.nextDouble();

        for(int i = 1; i <= time; i++) {
            interest = balance * (Math.pow((1 + rate / 100), 1)) - balance;
            balance += interest;

            System.out.printf("Mês %d: Juros: R$ %f , saldo: %f\n", i, interest, balance);
        }
    }
}
