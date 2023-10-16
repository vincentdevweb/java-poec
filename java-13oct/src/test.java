import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String codePinStr = "0";

        int codePin = 0;
        int maxAttempts = 5;
        int remainingAttempts = maxAttempts;
        System.out.println("Le code PIN doit toujours être composé de 4 chiffres.");
        codePinStr = input.next();
        while (codePinStr.length() != 4 && !input.hasNextInt()) {
            System.out.println("Le code PIN doit toujours être composé de 4 chiffres.");
            codePinStr = input.next();
            try {
                codePin = Integer.parseInt(codePinStr);
            } catch (NumberFormatException e) {
                System.err.println("La conversion a échoué. La chaîne n'est pas un nombre entier.");
            }
        }
        System.out.println("SUCCESS Le nombre entier est : " + codePin);

        while (remainingAttempts > 0) {
            System.out.print("Veuillez entrer le code PIN : ");
            int codePinATester = input.nextInt();

            if (codePinATester == codePin) {
                System.out.println("Code PIN correct. Appareil débloqué.");
                break;
            } else {
                remainingAttempts--;
                System.out.println("Code PIN incorrect. " + remainingAttempts + " tentative(s) restante(s).");

                if (remainingAttempts == 2) {
                    System.out.println("Au bout de 2 tentatives incorrectes, l'appareil sera bloqué.");
                }

                if (remainingAttempts == 0) {
                    System.out.println("L'appareil est bloqué. Contactez le support.");
                }
            }
        }

        input.close();
    }
}
