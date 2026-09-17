import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        //Duzbucaqlının area və perimeter
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Enter length: ");
        double length = sc.nextDouble();

        System.out.println("Area: " + width * length);
        System.out.println("Perimeter: " + 2 * (width + length));
    }
}