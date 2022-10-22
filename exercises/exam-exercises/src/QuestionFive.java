import java.util.Arrays;
import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        int amountTemperatures;
        String readTemperatures = "";
        double temp = 0.0, tempSumOrigin = 0.0, tempSumDestiny = 0.0, tempAvgOrigin = 0.0, tempAvgDestiny = 0.0;
        char originUnity, destinyUnity;
        Scanner reader = new Scanner(System.in);

        System.out.println("Quantas temperaturas serão transformadas?");
        amountTemperatures = reader.nextInt();

        for (int i = 1; i <= amountTemperatures; i++) {
            System.out.printf("Informe a temperatura %d: ", i);
            readTemperatures += reader.next() + " ";
        }

        String[] temperaturesArray = readTemperatures.trim().split(" ");

        double[] temperaturesArrayConverted = Arrays.stream(temperaturesArray).mapToDouble(Double::parseDouble).toArray();

        System.out.println("Qual a unidade de origem dessas temperaturas? [C, K, F]");
        originUnity = reader.next().charAt(0);

        System.out.println("Qual a unidade de destino dessas temperaturas? [C, K, F]");
        destinyUnity = reader.next().charAt(0);

        for (int i = 0; i < amountTemperatures; i++) {
            if(destinyUnity == 'C') {
                temp = celciusConverter(originUnity, temperaturesArrayConverted[i]);
            } else if (destinyUnity == 'K') {
                temp = kevinConverter(originUnity, temperaturesArrayConverted[i]);
            } else if (destinyUnity == 'F') {
                temp = fahrenheitConverter(originUnity, temperaturesArrayConverted[i]);
            }

            tempSumOrigin += temperaturesArrayConverted[i];
            tempSumDestiny += temp;

            System.out.printf("%.1f %s = %.1f %s\n", temperaturesArrayConverted[i], originUnity, temp, destinyUnity);
        }

        tempAvgOrigin = tempSumOrigin / amountTemperatures;
        tempAvgDestiny = tempSumDestiny / amountTemperatures;

        System.out.printf("A média das temperaturas é %.1f %s = %.1f %s", tempAvgOrigin, originUnity, tempAvgDestiny, destinyUnity);
    }

    public static double celciusConverter(char unity, double temperature) {
        double convertedTemp = 0.0;
        if(unity == 'F') {
            convertedTemp = (temperature - 32) * 0.55;
        }

        if (unity == 'K') {
            convertedTemp = temperature - 273.15;
        }

        return convertedTemp;
    }

    public static double kevinConverter(char unity, double temperature) {
        double convertedTemp = 0.0;

        if(unity == 'F') {
            convertedTemp = (temperature - 32) * 0.55 + 273.15;
        }

        if (unity == 'C') {
            convertedTemp = temperature + 273.15;
        }

        return convertedTemp;
    }

    public static double fahrenheitConverter(char unity, double temperature) {
        double convertedTemp = 0.0;

        if(unity == 'K') {
            convertedTemp = (temperature - 273.15) * 1.8 + 32;
        }

        if (unity == 'C') {
            convertedTemp = (temperature * 1.8) + 32;
        }

        return convertedTemp;
    }
}
