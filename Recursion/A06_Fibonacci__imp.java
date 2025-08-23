package Recursion;

public class A06_Fibonacci__imp {
    static int[] myFun(int[] arr, int i, int current, int next) {
        // base case // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        if (i == arr.length) {
            return arr;
        }
        arr[i] = current;
        return myFun(arr, i + 1, next, current + next);
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        int fib[] = myFun(arr, 0, 0, 1);

        for (int elem : fib) {
            System.out.print(elem + ", ");
        }
    }
}