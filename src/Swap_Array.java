import java.util.Arrays;
public class Swap_Array {
    public static void display(int[] arr) {
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        display(arr);
        System.out.println(Arrays.toString(arr));
    }
}
