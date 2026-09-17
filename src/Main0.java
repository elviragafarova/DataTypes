import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        //a daxil etdikde output A olur
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = a - 32;
        char c = (char) b;
        System.out.println(c);
    }
}