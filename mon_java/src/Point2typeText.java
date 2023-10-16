public class Point2typeText {
    public static void main(String[] args) {
        String firstName="Vincent";
        String lastName="Bollot";
        int age=21;
        double up=185.5;

        System.out.println("Je m'appele "+firstName+" "+lastName+", j'ai "+age+" ans et je mesure : "+up);
        System.out.printf("Je m'appele %s %s j'ai %d ans et je mesure : %f",firstName,lastName,age,up);
    }
}
