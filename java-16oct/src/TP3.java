import java.util.ArrayList;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> listes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> liste = new ArrayList<>();
            System.out.print(
                    "Entrez les éléments de la liste " + (i + 1) + " terminez par -42 pour finir la liste : ");
            int element;
            while ((element = input.nextInt()) != -42) {
                while (!input.hasNextInt()) {
                    System.out.println("La valeur n'est pas un entier. Réessayez : ");
                    input.next();
                }
                liste.add(element);
            }
            listes.add(liste);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("T" + (i + 1) + ": " + listes.get(i));
        }

        // Calcul de la somme des éléments multiples de 3 dans les listes
        int sommedesModulo3 = 0;
        System.out.print("S:");
        for (ArrayList<Integer> liste : listes) {
            for (int element : liste) {
                if ((((int) element) % 3) == 0) {
                    sommedesModulo3 += element;
                    System.out.print(element + " + ");
                }
            }
        }
        System.out.println("= " + sommedesModulo3);
        input.close();
    }
}
