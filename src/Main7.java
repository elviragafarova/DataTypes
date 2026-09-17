import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        //Ədədlərin ortası
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first exam grade: ");
        double a = sc.nextDouble();

        System.out.print("Enter second exam grade: ");
        double b = sc.nextDouble();

        System.out.print("Enter third exam grade: ");
        double c = sc.nextDouble();

        System.out.println("Average grade: " + (a + b + c) / 3);
    }
}