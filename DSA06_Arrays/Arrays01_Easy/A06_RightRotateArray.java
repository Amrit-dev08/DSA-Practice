public class A06_RightRotateArray {
    public static void RotateArrayM1(int[] arr, int k) {
        int n = arr.length;
        int temp[] = new int[k];
        //copy last k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        //shift the first n-k elements to the right
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        // Step 3: put temp at the front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    // for Right Rotation //
    // reverse entire array // reverse first k elements // reverse remaining n-k
    // elements
    public static void RotateArrayM2(int[] arr, int k) {
        int n = arr.length;
        // reverse entire array
        ReverseFun(arr, 0, n - 1);
        // reverse first k elements
        ReverseFun(arr, 0, k - 1);
        // reverse remaining n-k elements
        ReverseFun(arr, k, n - 1);
    }

    public static void ReverseFun(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;

        // RotateArrayM1(arr, k); // M1 : uses an extra array
        RotateArrayM2(arr, k); // M2 : reversal algorithm (optimized)

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ", ");
        }
    }
}
