// Time Complexity → O(n²)
// Space Complexity → O(n) (due to recursion stack)
// compare with Adjacent and do Swapping upto less than n-1 repeatation.
class A04_Recursive_Bubble_Sort {
    public static int[] myFun(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr;
        }
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

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