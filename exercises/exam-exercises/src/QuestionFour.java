import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        double loanAmount, interestRate, time, interestOfTheMonth = 0.0, amortization = 0.0, balance, totalPayable = 0.0, monthlyInstallment, totalInterest;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe o valor do empréstimo R$: ");
        loanAmount = reader.nextDouble();
        balance = loanAmount;

        System.out.print("Informe o juros ao mês em %: ");
        interestRate = reader.nextDouble();

        System.out.print("Informe o tempo em meses para a quitação do pagamento: ");
        time = reader.nextDouble();
        reader.close();

        amortization = loanAmount / time;

        System.out.printf("Valor fixo da parcela R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f ao mês.\n", amortization, loanAmount, interestRate);

        for (int i = 1; i <= time; i++) {
            interestOfTheMonth = balance * (interestRate / 100);
            monthlyInstallment = interestOfTheMonth + amortization;
            balance -= amortization;
            totalPayable += monthlyInstallment;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Amortização: R$ %.2f | Saldo devedor: R$ %.2f%n", i, interestOfTheMonth, monthlyInstallment, balance);
        }

        totalInterest = totalPayable - loanAmount;

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f", totalPayable, totalInterest, loanAmount);
    }
}
