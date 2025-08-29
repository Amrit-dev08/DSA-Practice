// Time Complexity → O(n²) 
// Space Complexity → O(1)
// Select minimum from UnSorted part and go to the Sorted part
class A03_Recursive_Selection_Sort {
    public static int[] myFun(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr;
        }
        int minIdx = i;
        // loop for finding minimum
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        // swap arr[i] with arr[minIdx]
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;

        return myFun(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 5, 3, 4, 9, 7, 8, 6 };
        System.out.println("Orignal -->");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
        myFun(arr, 0);
        System.out.println("\n\nSorted -->");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
    }
}