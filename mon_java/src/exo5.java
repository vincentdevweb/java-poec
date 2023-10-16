import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Votre langue : ");
        var language = input.next().toLowerCase();

        switch (language) {
            case "english" -> System.out.println("Hello!!");
            case "french" -> System.out.println("Salut!!");
            case "spanish" -> System.out.println("Hola!!");
            case "german" -> System.out.println("Guten tag");
            default -> System.out.println("Langue non supportée!!");
        }

        input.close();
    }
}
