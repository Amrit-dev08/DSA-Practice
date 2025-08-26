package DSA03_Recursion;

public class A13_FindingSumofAnArray {
    public static int myFun(int[] arr, int i, int sum) {
        if (i >= arr.length) {
            return sum;
        }
        return myFun(arr, i + 1, sum + arr[i]);
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55 };
        int sum = myFun(arr, 0, 0);
        System.out.println(sum);
    }
}