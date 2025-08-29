// Time Complexity → O(n²) 
// Space Complexity → O(1)
class A01_Selection_Sort {
    public static int[] myFun(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
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
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 5, 3, 4, 9, 7, 8, 6 };
        System.out.println("Orignal -->");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
        myFun(arr);
        System.out.println("\n\nSorted -->");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
    }
}