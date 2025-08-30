// Lomuto Partition (last element pivot) --> pivot se chota dhundte jao and bade wale se swap karte jao jb tkk ki iteration khatam na ho jaye, and then swap your pivot to correct position and return the pivotIndex
// Hoare Partition (first element pivot) --> ek infinite loop mai left pointer++ karte jao jbb tkk wo pivot se chota hai and right pointer-- karte jao jbb tkk wo pivot se bada hai. at the end agr(left >= right) ho gya to right return krdo warna left and right positioned element ko swap kardo.

class Test {
    public static int LomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot element (last element)
        int left = low - 1; // index of smaller element

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                left++;
                // swap arr[i] with arr[left]
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
            }
        }

        // correct positioning of pivot element
        int temp = arr[left + 1];
        arr[left + 1] = arr[high];
        arr[high] = temp;

        return left + 1; // pivot index
    }

    public static int HoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low - 1;
        int right = high + 1;
        while (true) {
            do {
                left++;
            } while (arr[left] < pivot);
            do {
                right--;
            } while (arr[right] > pivot);
            if (left >= right) {
                return right;
            }
            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void myQuickSortFun(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = LomutoPartition(arr, low, high); // M1 for partition
            // int pivotIndex = HoarePartition(arr, low, high); // M2 for partition
            myQuickSortFun(arr, low, pivotIndex - 1);
            myQuickSortFun(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 2, 5, 4, 6, 8, 7, 9, 3 };
        System.out.println("\nOriginal:");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        myQuickSortFun(arr, 0, arr.length - 1);

        System.out.println("\nSorted:");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
