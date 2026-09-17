import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        //Dairənin area və length
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        double r = sc.nextDouble();
        double pi = 3;

        System.out.println("Area: " + pi*r*r);
        System.out.println("Length : " + 2*pi*r);
    }
}