import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Entrer un nombre pour la multiplication : ");
        var nombre = input.nextInt();

        System.out.println("Entrer un nombre pour le debut de la multiplication : ");
        var debutTable = input.nextInt();

        System.out.println("Entrer un nombre pour la fin de la multiplication : ");
        var finTable = input.nextInt();

        for (int i = debutTable; i <= finTable; i++) {
            System.out.printf("La multiplication de %d par %d est %d\n", nombre, i, nombre*i);
        }
        input.close();
    }
}

