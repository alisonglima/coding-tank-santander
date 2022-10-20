public class FourArgs {
    public static void main(String[] args) {
        String numType;

        if (args.length != 1) {
            System.out.printf("Número inválido de argumentos, é esperado que seja informado um argumento.", args.length);
            return;
        }

        numType = Integer.parseInt(args[0]) % 2 == 0 ? "Esse número é par" : "Esse número é ímpar";

        System.out.print(numType + ".");
    }
}
