public class LCM {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int lcm = (a*b)/gcd(a,b);
        System.out.println("lcm :"+ lcm);
    }
       
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
