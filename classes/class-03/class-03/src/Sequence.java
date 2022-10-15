import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        int a, b;
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe o valor inicial: ");
        a = reader.nextInt();

        System.out.print("Informe o valor final: ");
        b = reader.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
