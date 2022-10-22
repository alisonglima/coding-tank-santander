import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        String month;
        int days;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe o mês: ");
        month = reader.next().toLowerCase();
        reader.close();

        switch (month) {
            case "janeiro":
                days = 31;
                break;
            case "fevereiro":
                days = 28;
                break;
            case "março":
                days = 31;
                break;
            case "abril":
                days = 30;
                break;
            case "maio":
                days = 31;
                break;
            case "junho":
                days = 30;
                break;
            case "julho":
                days = 31;
                break;
            case "agosto":
                days = 31;
                break;
            case "setembro":
                days = 30;
                break;
            case "outubro":
                days = 31;
                break;
            case "novembro":
                days = 30;
                break;
            case "dezembro":
                days = 31;
                break;
            default:
                days = 0;
                break;
        }

        month = month.substring(0, 1).toUpperCase() + month.substring(1);

        if (days == 0) {
            System.out.printf("%s não é uma entrada válida.", month);
            return;
        }

        System.out.printf("%s possui %d dias.", month, days);
    }
}
