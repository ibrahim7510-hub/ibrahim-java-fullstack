public class If {
    public static void main(String[] args) {
        int percentage = 50;
        boolean hasHallTicket = true;

        if (hasHallTicket) {

            if (percentage >= 50) {
                System.out.println("eligible to write exam");
            } else {
                System.out.println("pay fine amount");
            }
               
        } else {
            System.out.println("not eligible to write exam");
        }  
        int a = 3;

        switch (a) {
            case 1:
                System.out.println(a++);  
                break;
            case 2:
                System.out.println(++a);  
                break;
            case 3:
                System.out.println(a - 1);
                a--;
                break;
            default:
                System.out.println("default case");
        }

        System.out.println("Value of a after switch: " + a);

        char c = 'd';

        switch (c) {
            case 'a':
                System.out.println(c);
                break;
            case 'b':
                System.out.println(c);
                break;
            case 'c':
                System.out.println(c);
                break;
            case 'd':
                System.out.println(c);
                break;
            default:
                System.out.println(c);
        }
    }
}
  
