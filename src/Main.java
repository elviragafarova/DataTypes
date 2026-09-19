import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //data types
        byte y = 100;
        short s = 12;
        int a = 25;
        long l = 1000L;
        float f = 10.5f;
        double d = 20.75;
        char c = 'A';
        boolean is = true;

        System.out.println("byte: " + y);
        System.out.println("short: " + s);
        System.out.println("int: " + a);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + is);

        //a daxil etdikde output A olur
        Scanner sc = new Scanner(System.in);
        char a1 = sc.next().charAt(0);
        int b1 = a1 - 32;
        char c1 = (char) b1;
        System.out.println(c1);

        //explicit casting data itkisi olur
        //double-dakı hər dəyəri int saxlaya bilmir, int yalnız tam hissəni saxlayır
        //meselen burda int 12 saxlayir 0.5 data itkisi olur
        double i = 12.5;
        int b = (int) i;
        System.out.println(b);

        //implicit casting automatic cevrilir
        //int double-ın alt çoxlugudur ona gore de hər int dəyər double-da saxlanıla bilər.
        int i1 = 23;
        double d1 = i1;
        System.out.println(d1);


        //char
        char a3 = 'A';
        int asciiCode = a3;

        System.out.println(a3);
        System.out.println(asciiCode);

        int b3 = 66;
        char c3 = (char) b3;

        System.out.println(b3);
        System.out.println(c3);


        //scanner ile name&age alma
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");



        //Arithmetic Operators
        System.out.print("Enter first number: ");
        int a4 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b4 = scanner.nextInt();

        System.out.println("Addition: " + (a4 + b4));
        System.out.println("Subtraction: " + (a4 - b4));
        System.out.println("Multiplication: " + (a4 * b4));
        System.out.println("Division: " + (a4 / b4));
        System.out.println("Modules: " + (a4 % b4));



        //Relational Operators
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a5 = scanner2.nextInt();

        System.out.print("Enter second number: ");
        int b5 = scanner2.nextInt();

        System.out.println("a > b: " + (a5 > b5));
        System.out.println("a < b: " + (a5 < b5));
        System.out.println("a == b: " + (a5 == b5));
        System.out.println("a != b: " + (a5 != b5));
        System.out.println("a >= b: " + (a5 >= b5));
        System.out.println("a <= b: " + (a5 <= b5));



        //NOT operator
        boolean abc = true;
        System.out.println(!abc);



        //Ədədi orta
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Enter first exam grade: ");
        double a7 = sc3.nextDouble();

        System.out.print("Enter second exam grade: ");
        double b7 = sc3.nextDouble();

        System.out.print("Enter third exam grade: ");
        double c7 = sc3.nextDouble();

        System.out.println("Average grade: " + (a7 + b7 + c7) / 3);



        //Duzbucaqlının area və perimeter
        Scanner sc4 = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = sc4.nextDouble();

        System.out.println("Enter length: ");
        double length = sc4.nextDouble();

        System.out.println("Area: " + width * length);
        System.out.println("Perimeter: " + 2 * (width + length));



        //Dairənin area və length
        System.out.println("Enter radius");
        double r = sc4.nextDouble();
        double pi = 3;

        System.out.println("Area: " + pi*r*r);
        System.out.println("Length : " + 2*pi*r);
    }
}