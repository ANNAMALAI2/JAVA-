import java.util.Arrays;
public class Arminmx { public static void main(String[] args) {
        int[] array = {10, 7, 19, 3,12,8,11};
        int n = 3,b=4; 
        int nthSmallest = array[n - 1];
        int nthLargest = array[array.length - b];
        System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println("The " + n + " smallest element is: " + nthSmallest);
        System.out.println("The " + b + " largest element is: " + nthLargest);
    }
}
