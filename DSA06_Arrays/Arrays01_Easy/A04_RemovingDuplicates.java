import java.util.Arrays;
import java.util.HashSet;

public class A04_RemovingDuplicates {
    public static void RemoveDuplicateM1(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.print(set);
    }

    public static void RemoveDuplicateM2(int[] arr) {
        int n = arr.length;
        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }
        // Copy unique elements into new array
        int[] uniqueArr = Arrays.copyOf(temp, j);
        // Print result
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 5, 5, 4, 4, 4, 4, 4, 3, 3 };
        RemoveDuplicateM1(arr); // M1
        // RemoveDuplicateM2(arr); // M2
    }
}
