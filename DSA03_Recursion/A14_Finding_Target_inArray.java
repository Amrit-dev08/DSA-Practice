package DSA03_Recursion;

public class A14_Finding_Target_inArray {
    public static int myFun(int[] arr, int i, int target) {
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return myFun(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55 };
        int index = myFun(arr, 0, 44);
        if (index == -1) {
            System.out.println("Target not Found!");
        } else {
            System.out.println("Index of target is => " + index);
        }
    }
}