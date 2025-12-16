import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter first number:");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();

        System.out.println("Enter third number:");
        c = sc.nextInt();

        // comparing three numbers
        if (a >= b && a >= c) {
            System.out.println("Greatest number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Greatest number is: " + b);
        } 
        else {
            System.out.println("Greatest number is: " + c);
        }

        sc.close();
    }
}
