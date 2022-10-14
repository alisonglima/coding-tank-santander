import java.util.Scanner;

public class ImprimirNome {
    public static void main(String[] args) {
        System.out.print("Digite o seu nome: ");
        Scanner name = new Scanner(System.in);

        System.out.println("Boa noite, " + name.next());
        name.close();
    }
}
