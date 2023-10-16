import java.util.ArrayList;
import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        var tailleTableau = 0;
    
        // Taille du tableau
        do {
            System.out.print("Entrez la taille du tableau : ");
            while (!input.hasNextInt()) {
                System.out.println("La valeur n'est pas un entier. Réessayez : ");
                input.next();
            }
            tailleTableau = input.nextInt();
    
        } while (tailleTableau < 0);
    
        var entier = new ArrayList<Integer>();
    
        // Stocker les entiers dans le tableau
        for (var i = 0; i < tailleTableau; i++) {
            System.out.printf("Entrez un entier n°%d : ", (i + 1));
            while (!input.hasNextInt()) {
                System.out.println("La valeur n'est pas un nombre. ");
                input.next();
            }
            var valeur = input.nextInt();
            entier.add(valeur);
        }
        
        // Parcourir tous les elements du tableau et le comparer avec le premier et stocker cette valeur dans la variable int
        if (entier.size() > 0) {
            var plusGrand = entier.get(0);
            var plusPetit = entier.get(0);
            for (int valeur : entier) {
                if (valeur > plusGrand) {
                    plusGrand = valeur;
                }
                if (valeur < plusPetit) {
                    plusPetit = valeur;
                }
            }
    
            // Afficher le tableau
            System.out.print("Tb : [");
            for (int element : entier) {
                System.out.print(element);
                if (element == plusGrand) {
                    System.out.print("(PG)");
                }
                if (element == plusPetit) {
                    System.out.print("(PP)");
                }
                //Ajouter la virgule à tous les entiers a part le dernier entier
                if (element != entier.get(entier.size() - 1)) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        input.close();
    }
}
