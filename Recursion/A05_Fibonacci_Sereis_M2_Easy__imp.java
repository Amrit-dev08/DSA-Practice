// ===== IMPORTANT NOTES ===== //
// fib(n) = fib(n-1) + fib(n-2)

package Recursion;

public class A05_Fibonacci_Sereis_M2_Easy__imp {

    static int[] myFun(int[] arr, int i, int s_last, int last) {
        // Base case
        if (i == arr.length) {
            return arr;
        }
        if (i == 0) {
            arr[i] = 0;
        } else if (i == 1) {
            arr[i] = 1;
        } else {
            arr[i] = s_last + last; // fib(n) = fib(n-1) + fib(n-2)
            s_last = last;
            last = arr[i];
        }
        return myFun(arr, i + 1, s_last, last);
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        int res[] = myFun(arr, 0, 0, 1);
        for (int elem : res) {
            System.out.print(elem + ", ");
        }
    }
}
