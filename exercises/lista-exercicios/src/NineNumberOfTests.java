import java.util.Scanner;

public class NineNumberOfTests {
    public static void main(String[] args) {
        int numberOfTests, score, minor = 101, major = 0, avg = 0;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe a quantidade de provas: ");
        numberOfTests = reader.nextInt();

        for(int i = 1; i <= numberOfTests; i++) {
            System.out.printf("Informe a nota da prova %d: ", i);
            score = reader.nextInt();


            if(score < minor) minor = score;
            if(score > major) major = score;
            avg += score;
        }

        avg = avg / numberOfTests;

        System.out.printf("A menor nota é %d: \n", minor);
        System.out.printf("A maior nota é %d: \n", major);
        System.out.printf("A média das notas é %d: \n", avg);
    }
}
