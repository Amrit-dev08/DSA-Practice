public class A05_LeftRotateArray {
    public static void RotateArrayM1(int[] arr, int k) {
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }
        int tempCount = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[tempCount];
            tempCount++;
        }
    }

    public static void RotateArrayM2(int[] arr, int k) {
        int n = arr.length;
        // reverse first k elements
        ReverseFun(arr, 0, k - 1);
        // reverse remaining n-k elements
        ReverseFun(arr, k, n - 1);
        // reverse entire array
        ReverseFun(arr, 0, n - 1);
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
        int k = 2;

        // RotateArrayM1(arr, k); // M1 : uses an extra array
        RotateArrayM2(arr, k); // M2 : reversal algorithm (optimized)

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ", ");
        }
    }
}
