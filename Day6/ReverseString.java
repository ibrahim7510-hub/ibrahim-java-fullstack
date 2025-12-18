import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
        
       char[] arr = s.toCharArray();
       int start = 0;
       int end = arr.length - 1;
       while(start < end){
           char temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
       System.out.println(new String());
       

    }
}
