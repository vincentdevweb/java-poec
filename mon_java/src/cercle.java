import java.util.Scanner;

public class cercle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("saisir le diametre : ");
        double rayon = input.nextDouble()/2;
        double pi = 3.14;
        double Surface = rayon*rayon*pi ;
        System.out.printf("la surface est de : %.2f",Surface);
    }
}
