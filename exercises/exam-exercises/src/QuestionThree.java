import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        int terms;
        Scanner reader = new Scanner(System.in);

        System.out.println("Qual a quantidade de termos que deseja exibir da sequência de Fibonnaci?");
        terms = reader.nextInt();
        reader.close();

        for(int i = 1; i <= terms; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n){
        if(n == 1 || n == 2)
            return 1;

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
