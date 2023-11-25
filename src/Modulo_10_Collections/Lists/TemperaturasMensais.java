package Modulo_10_Collections.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturasMensais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<Double>();

        // Adicionando as temperaturas na lista
        for (int i = 1; i <= 6; i++) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
        }

        // Calculando a média semestral das temperaturas
        double somaTemperaturasSemestral = 0.0;
        for (double temp : temperaturasSemestral) {
            somaTemperaturasSemestral += temp;
        }
        double mediaTemperaturasSemestral = somaTemperaturasSemestral / temperaturasSemestral.size();

        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.printf("Média das temperaturas Semestral: %.1f\n", mediaTemperaturasSemestral);

        // Exibindo as temperaturas acima da média e o mês correspondente
        System.out.println("Temperaturas acima da média: ");
        for (int i = 0; i < temperaturasSemestral.size(); i++) {
            double temp = temperaturasSemestral.get(i);
            if (temp > mediaTemperaturasSemestral) {
                switch (i) {
                    case 0:
                        System.out.println("Janeiro: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println("Fevereiro: " + temp + " oC");
                        break;
                    case 2:
                        System.out.println("Março: " + temp + " oC");
                        break;
                    case 3:
                        System.out.println("Abril: " + temp + " oC");
                        break;
                    case 4:
                        System.out.println("Maio: " + temp + " oC");
                        break;
                    case 5:
                        System.out.println("Junho: " + temp + " oC");
                        break;
                }
            }
        }
    }
}
