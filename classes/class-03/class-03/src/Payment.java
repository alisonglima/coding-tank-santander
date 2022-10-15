import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Double inputValue, discount, finalValue;
        int paymentForm;

        Scanner reader = new Scanner(System.in);

        System.out.print("Qual o valor da compra?: R$");
        inputValue = reader.nextDouble();

        System.out.print("Digite a forma de pagamento [1-Crédito, 2-Débito, 3-Cheque, 4-Boleto, 5-Dinheiro, 6-Pix]: ");
        paymentForm = reader.nextInt();

        if(inputValue < 1 || inputValue > 6) {
            System.out.print("Forma de pagamento inválida.");
            return;
        }

        switch (paymentForm) {
            case 1:
            case 2:
                discount = inputValue * 0.03;
                break;
            case 3:
                discount = inputValue * 0.06;
                break;
            case 4:
                discount = inputValue * 0.09;
                break;
            case 5:
            case 6:
                discount = inputValue * 0.12;
                break;
            default:
                discount = 0.0;
        }

        System.out.print("O desconto é de R$" + discount);
        finalValue = inputValue - discount;
        System.out.print("O valor final é de R$" + finalValue);
    }
}
