package DSA03_Recursion;

public class A12_FindingMaxFromArray {
    public static int myFun(int[] arr, int i, int max) {
        if (i >= arr.length) {
            return max;
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        return myFun(arr, i + 1, max);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 200, 30, 140, 50 };
        int max = myFun(arr, 0, 0);
        System.out.println(max);
    }
}
