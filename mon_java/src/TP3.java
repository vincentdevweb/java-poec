import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("How many months from last December : ");
        var monthNumber = input.next();
        switch (monthNumber) {
            case "1" -> System.out.println("So it's January");
            case "2" -> System.out.println("So it's February");
            case "3" -> System.out.println("So it's March");
            case "4" -> System.out.println("So it's April");
            case "5" -> System.out.println("So it's May");
            case "6" -> System.out.println("So it's June");
            case "7" -> System.out.println("So it's July");
            case "8" -> System.out.println("So it's August");
            case "9" -> System.out.println("So it's September");
            case "10" -> System.out.println("So it's October");
            case "11" -> System.out.println("So it's November");
            case "12" -> System.out.println("So it's December");
            default -> System.out.println("Write a number from 1 to 12");
        }
    }
}