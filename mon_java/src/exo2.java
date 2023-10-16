import java.time.Year;
import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez votre âge : ");
        int age = input.nextInt();
        int anneeCourante = Year.now().getValue();
        int anneeDeNaissance = anneeCourante - age;
        System.out.printf("Votre année de naissance est : %d",anneeDeNaissance);
        input.close();
    }
}
