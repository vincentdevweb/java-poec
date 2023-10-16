import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("saisir a : ");
        var a = input.nextInt();
        System.out.println("saisir b : ");
        var b = input.nextInt();
        System.out.println("saisir c : ");
        var c = input.nextInt();
        //Polynome de second deg ax^2+bx+c
        //resolution delta = b²-4ac
        var delta = Math.pow(b,2)-(4*a*c);
        //x1 et x2
        if(delta>0){
            // Deux racines réelles
        var x1 = (-b+Math.sqrt(delta))/(2*a);
        var x2 = (-b-Math.sqrt(delta))/(2*a);
        System.out.printf("le resultat x1 = %.2f | le resultat x2 = %.2f",x1,x2);
        }else if(delta == 0){
            // Une seule racine réelle
        var x1et2 = (-b)/(2*a);
        System.out.printf("le resultat x1 et x2 = %.2f",x1et2);
        }else{
            // Pas de racines réelles
        System.out.println("Il n'y a pas de solution");
        }
        input.close();
    }
}
