public class Operadores {
    public static void main(String[] args) {
        String str = "";
        final int a = 10;
        int b = 2;
        var c = 3;
        System.out.println(a + " e " + b);
        System.out.println("Soma: " + sum(a , b));
        System.out.println("Subtração: " + subtraction(a, b));
        System.out.println("Multiplicação: " + multiplication(a, b));
        System.out.println("Divisão: " + division(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
}
