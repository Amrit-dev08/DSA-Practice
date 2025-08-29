// Time Complexity → O(n²)
// Space Complexity → O(n)
// pick an element and insert it in its best place via swapping with left element again and again.
public class A06_Recursive_Insertion_Sort {
    public static int[] RecursiveInsertionBySwap(int[] arr, int i) {
        if (i == arr.length) {
            return arr;
        }
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        return RecursiveInsertionBySwap(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 5, 3, 4, 9, 7, 8, 6 };
        System.out.println("Orignal -->");
        for (int elem : arr)
            System.out.print(elem + ", ");
        RecursiveInsertionBySwap(arr, 0);
        System.out.println("\n\nSorted -->");
        for (int elem : arr)
            System.out.print(elem + ", ");
    }
}
