import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TP1TabDyn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Demander la taille du tableau à l'utilisateur. Tant que la valeur n'est
        // pas correcte, il faut recommencer l'opération
        int tailleTableau;
        do {
            System.out.print("Entrez la taille du tableau : ");
            // while (!input.hasNextInt()) {
            // System.out.println("La valeur n'est pas un entier. Réessayez : ");
            // input.next();
            // }
            // tailleTableau = input.nextInt();
            tailleTableau = (int) (Math.random() * (6)) + 2;
            System.out.println(tailleTableau);
        } while (tailleTableau < 0);

        ArrayList<Double> notesPhysique = new ArrayList<Double>();

        // 2. Limiter les valeurs entre 0 et 20.
        for (int i = 0; i < tailleTableau; i++) {
            do {
                System.out.printf("Entrez la note n°%d (entre 0 et 20) : ", (i + 1));
                // while (!input.hasNextDouble()) {
                // System.out.println("La valeur n'est pas un entier. Réessayez : ");
                // input.next();
                // }
                // notesPhysique[i] = input.nextDouble();
                notesPhysique.add(Math.random() * 20);
                System.out.println(notesPhysique.get(i));
            } while (notesPhysique.get(i) < 0 ||notesPhysique.get(i) > 20);
        }

        // 3. Calculer la somme et la moyenne des notes
        double somme = 0;
        for (double note : notesPhysique) {
            somme += note;
        }

        // notesPhysique.forEach(note ->{
        //     somme += note;
        // });

        double moyenne = somme / notesPhysique.size();

        System.out.println("Somme des notes : " + somme);
        System.out.println("Moyenne des notes : " + moyenne);

        input.close();
    }
}
