package Modulo_10_Collections.Map;
import java.util.Scanner;

public class IdadePlanetaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();
        double idadePlanetaria = 0;
        if (planeta.equals("Marte")) {
            idadePlanetaria = idadeTerrestre / 1.88;
        } else if (planeta.equals("Venus")) {
            idadePlanetaria = idadeTerrestre / 0.62;
        } else if (planeta.equals("Jupiter")) {
            idadePlanetaria = idadeTerrestre / 11.86;
        } else {
            System.out.println("Planeta invalido.");
        }

        if (idadePlanetaria != 0) {
            System.out.printf("Idade equivalente em %s: %.2f anos", planeta, idadePlanetaria);
        }

        scanner.close();
    }}