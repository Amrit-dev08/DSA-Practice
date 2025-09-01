public class A08_LinearSearch {
    public static int myFun(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 24, 36, 48, 60 };
        int key = 36;
        int res = myFun(arr, key);
        if (res == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key Found at Index : " + res);
        }
    }
}
