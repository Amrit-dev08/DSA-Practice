// ===== IMPORTANT NOTES ===== //
// fib(n) = fib(n-1) + fib(n-2)

package DSA03_Recursion;

public class A05_Fibonacci_Sereis_M2_Easy__imp {

    static int[] myFun(int[] arr, int i, int s_last, int last) {
        // Base case
        if (i == arr.length) {
            return arr;
        }
        switch (i) {
            case 0:
                arr[i] = 0;
                break;
            case 1:
                arr[i] = 1;
                break;
            default:
                arr[i] = s_last + last; // fib(n) = fib(n-1) + fib(n-2)
                s_last = last;
                last = arr[i];
                break;
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
