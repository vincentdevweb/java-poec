import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Saisissez un texte : ");
        var saisieText = input.nextLine();
        
        String inverse = new StringBuilder(saisieText).reverse().toString();
        System.out.printf("Votre chaine : %s \n",saisieText);
        System.out.printf("Résultat  : %s ",inverse);
        input.close();
    }
}
