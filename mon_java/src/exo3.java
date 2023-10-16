import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez a (int) : ");
        int a = input.nextInt();
        System.out.print("Entrez b (int) : ");
        int b = input.nextInt();
        System.out.print("Entrez c (int) : ");
        int c = input.nextInt();
        System.out.print("Entrez x (double) : ");
        double x = input.nextDouble();

        // Polynôme = ((a+b)/2)x^3 + (a+b)^2x^2 + a + b + c
        double resultat = ((a + b) / 2.0) * Math.pow(x, 3) + Math.pow(a + b, 2) * Math.pow(x, 2) + a + b + c; 
        System.out.printf("La valeur du polynôme est : %.4f", resultat);
        input.close();


    }
}
