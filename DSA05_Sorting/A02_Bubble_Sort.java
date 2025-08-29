// Time Complexity → O(n²)
// Space Complexity → O(1)
// compare with Adjacent and do Swapping upto less than n-1 repeatation.
class A02_Bubble_Sort {
    public static int[] myFun(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // for (int j = 0; j < arr.length - 1 - i; j++)
            // for reduce unneccesary comparision bcs last (i) elements is already sorted
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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