import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[]args){
        int n = 5;
        int [] arr = new int[n];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
        }
    }
}