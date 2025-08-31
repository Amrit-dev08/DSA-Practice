public class A01_FindMax {
    public static void main(String[] args) {
        int arr[] = { 213, 324, 234, 534, 140 };
        int max = arr[0];
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        System.out.println("Max element is " + max + " and, \nits index is " + maxIdx);
    }
}
