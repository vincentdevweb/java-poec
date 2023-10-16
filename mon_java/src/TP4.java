import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double premierNombre = input.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double deuxiemeNombre = input.nextDouble();

        System.out.println("Opérations disponibles :");
        System.out.println("1. Addition (+) tapez 1");
        System.out.println("2. Soustraction (-) tapez 2");
        System.out.println("3. Multiplication (x) tapez 3");
        System.out.println("4. Division (/) tapez 4");

        System.out.print("Votre choix : ");
        int choix = input.nextInt();

        double resultat = 0.0;

        switch (choix) {
            case 1 -> resultat = premierNombre + deuxiemeNombre;
            case 2 -> resultat = premierNombre - deuxiemeNombre;
            case 3 -> resultat = premierNombre * deuxiemeNombre;
            case 4 -> {
                if (deuxiemeNombre != 0) {
                    resultat = premierNombre / deuxiemeNombre;
                } else {
                    System.out.println("Erreur : Division par zéro n'est pas autorisée.");
                    return;
                }
            }
            default -> {
                System.out.println("Choix invalide.");
                return;
            }
        }
        System.out.println(premierNombre + " " + getOperateur(choix) + " " + deuxiemeNombre + " = " + resultat);
        input.close();
    }

    public static String getOperateur(int choix) {
        return switch (choix) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "x";
            case 4 -> "/";
            default -> "Opérateur inconnu";
        };
    }
}

