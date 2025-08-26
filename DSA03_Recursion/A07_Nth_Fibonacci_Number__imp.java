package DSA03_Recursion;

public class A07_Nth_Fibonacci_Number__imp {

    static int myFun(int[] arr, int i, int current, int next) {
        // base case // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        if (i == arr.length) {
            return arr[i - 1];
        }
        arr[i] = current;
        return myFun(arr, i + 1, next, current + next);
    }

    public static void main(String[] args) {
        int n = 10; // Expected 34
        int arr[] = new int[n];
        int res = myFun(arr, 0, 0, 1);
        System.out.print(res);
    }
}
