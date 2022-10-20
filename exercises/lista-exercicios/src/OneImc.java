import java.util.Scanner;

public class OneImc {
    public static void main(String[] args) {
        Double height, weight, imc;
        String classification = "";
        Scanner reader = new Scanner(System.in);

        System.out.println("Informe sua altura em metros?");
        height = reader.nextDouble();

        System.out.println("Informe seu peso em Kg?");
        weight = reader.nextDouble();

        imc = weight / (height * height);

        if (imc < 17.0) {
            classification = "Muito abaixo do peso";
        } else if (imc > 17.0 && imc < 18.49) {
            classification = "Abaixo do peso";
        } else if (imc > 18.5 && imc < 24.99) {
            classification = "Peso normal";
        } else if (imc > 25.0 && imc < 29.99) {
            classification = "Acima do peso";
        } else if (imc > 30.0 && imc < 34.99) {
            classification = "Obesidade I";
        } else if (imc > 35.0 && imc < 39.99) {
            classification = "Obesidade II (severa)";
        } else if (imc > 40.0) {
            classification = "Obesidade III (mórbida)";
        }

        System.out.printf("O valor do seu IMC é %f (%s)", imc, classification);
    }
}
