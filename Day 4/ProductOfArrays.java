import java.util.*;

public class ProductOfArrays {
public static void main(String[] args) {
int[] a = {1, 2, 3, 4};
int[] b = {1, 2, 3};


    int maxLength = a.length;
    int[] result = new int[maxLength];

    for (int i = 0; i < maxLength; i++) {
        if (i < b.length) {
            result[i] = a[i] * b[i];
        } else {
            result[i] = a[i]; // keep remaining elements
        }
    }

    System.out.println(Arrays.toString(result));
}


}
