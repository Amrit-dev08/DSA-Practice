package DSA03_Recursion;
import java.util.Arrays;

class A03_Palindrome {

    static int[] myFun(int[] arr, int l, int r) {
        if (l > r) {
            return arr;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        myFun(arr, l + 1, r - 1);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 };
        int org[] = arr.clone();
        int rev[] = myFun(arr, 0, arr.length - 1);
        if (Arrays.equals(org, rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}