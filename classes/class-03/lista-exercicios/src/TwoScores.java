import java.util.Scanner;

public class TwoScores {
    public static void main(String[] args) {
        Double score1, score2, score3, score4, avg;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe a nota prova 1: ");
        score1 = reader.nextDouble();

        System.out.print("Informe a nota prova 2: ");
        score2 = reader.nextDouble();

        System.out.print("Informe a nota prova 3: ");
        score3 = reader.nextDouble();

        System.out.print("Informe a nota prova 4: ");
        score4 = reader.nextDouble();

        avg = (score1 + score2 + score3 + score4) / 4;

        System.out.printf("A média do aluno foi %f", avg);
    }
}
