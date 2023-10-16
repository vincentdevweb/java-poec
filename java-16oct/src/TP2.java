import java.util.ArrayList;
import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int tailleTableau;
        do {
            System.out.print("Entrez la taille du tableau : ");
            while (!input.hasNextInt()) {
                System.out.println("La valeur n'est pas un entier. Réessayez : ");
                input.next();
            }
            tailleTableau = input.nextInt();
        } while (tailleTableau < 0);

        ArrayList<Integer> notes = new ArrayList<Integer>();

        for (int i = 0; i < tailleTableau; i++) {
            System.out.printf("Entrez un entier n°%d : ", (i + 1));
            while (!input.hasNextDouble()) {
                System.out.println("La valeur n'est pas un entier. Réessayez : ");
                input.next();
            }
            notes.add(input.nextInt());
        }

        int nombreRechercher;
        System.out.println("Entrer un nombre a rechercher : ");
        while (!input.hasNextInt()) {
            System.out.println("La valeur n'est pas un entier. Réessayez : ");
            input.next();
        }
        nombreRechercher = input.nextInt();

        int match = 0;
        for (int i = 0; i < tailleTableau; i++) {
            if (nombreRechercher == notes.get(i)) {
                match++;
            }
        }
        System.out.printf("%d existe et se retrouve %d fois dans le tableau", nombreRechercher, match);
        input.close();
    }
}
