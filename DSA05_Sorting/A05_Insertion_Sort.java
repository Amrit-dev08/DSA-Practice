
// Time Complexity → O(n²)
// Space Complexity → O(1)
// pick an element and insert it in its best place via swapping with left element again and again.
class A05_Insertion_Sort {
    public static int[] InsertionBySwap(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static int[] InsertionByShift(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 5, 3, 4, 9, 7, 8, 6 };

        System.out.println("Orignal -->");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }

        // InsertionBySwap(arr);
        // InsertionByShift(arr);

        System.out.println("\n\nSorted -->");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }

    }
}