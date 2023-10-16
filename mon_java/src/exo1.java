import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Entrez la première valeur (a) : ");
        int a = input.nextInt();
        System.out.print("Entrez la deuxième valeur (b) : ");
        int b = input.nextInt();
        System.out.print("Entrez la troisième valeur (c) : ");
        int c = input.nextInt();

        System.out.println("Les valeurs entrées sont : a = " + a + ", b = " + b + " et c = " + c);

        // Permutation
        int temp = b;
        b = a;
        a = c;
        c = temp;

        System.out.println("Permutation : b <== a, c <== b, a <== c");
        System.out.println("Les valeurs permutées sont : a = " + a + ", b = " + b + " et c = " + c);

        input.close();
    }
}