import java.util.*;

class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int y;
            y = sc.nextInt();

            if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
            }
        }
    }
}