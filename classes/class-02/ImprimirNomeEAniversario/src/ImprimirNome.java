import java.util.Scanner;

public class ImprimirNome {
    public static void main(String[] args) {
        System.out.print("Olá, qual o seu nome?: ");
        Scanner name = new Scanner(System.in);
        System.out.println("Boa noite, " + name.next());

        System.out.print("Qual o seu ano de nascimento?: ");
        Scanner birthday = new Scanner(System.in);
        System.out.println("No final de 2022 você terá " + (2022 - birthday.nextInt()) + " anos.");
    }
}
