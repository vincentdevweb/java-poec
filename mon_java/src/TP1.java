import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = input.nextInt();

        String parite = nombre % 2 == 0 ? "pair" : "impair";
        String signe = nombre > 0 ? "positif" : "negatif";

        System.out.printf("Le nombre est %s et %s", signe, parite);

        if (nombre == 0) {
            System.out.println("le chiffre est zero et pair");
        }

        input.close();
    }
}
