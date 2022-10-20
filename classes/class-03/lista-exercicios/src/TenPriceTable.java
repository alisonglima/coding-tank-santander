import java.util.Scanner;

public class TenPriceTable {
    public static void main(String[] args) {
        double initialValue, rate, time, interest = 0.0, amortization = 0.0, balance, totalPayable, fixedInstallment, debitBalance;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe o valor do empréstimo R$: ");
        initialValue = reader.nextDouble();
        balance = initialValue;

        System.out.print("Informe o juros ao mês em %: ");
        rate = reader.nextDouble();

        System.out.print("Informe o tempo em meses para a quitação do pagamento: ");
        time = reader.nextDouble();

        totalPayable = CompoundInterestCalculation(rate, initialValue, time);
        fixedInstallment = totalPayable / time;

        System.out.printf("Valor fixo da parcela R$ %f, Saldo devedor total R$ %f\n", fixedInstallment, initialValue);

        for (int i = 1; i <= time; i++) {
            interest = balance * (rate / 100);
            amortization = fixedInstallment - interest;
            balance += initialValue - fixedInstallment + interest;

            System.out.printf("Parcela %d | Juros: R$ %f, Amortização: %f, Saldo devedor: %f\n", i, interest, amortization, balance);
        }

        System.out.printf("Total: Prestação R$ %f, Juros R$ %f, Amortização R$ %f", totalPayable, (totalPayable - initialValue), initialValue);
    }

    public static double CompoundInterestCalculation(double rate, double balance, double time) {
        double interest = 0.0;
        for(int i = 1; i <= time; i++) {
            interest = balance * (Math.pow((1 + rate / 100), 1)) - balance;
            balance += interest;
        }

        return balance;
    }
}
