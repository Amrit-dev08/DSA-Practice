
import java.util.ArrayList;

public class A07_MoveAllZerosToEnd {

    public static void myFun(int[] arr) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempArr.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < tempArr.size()) {
                arr[i] = tempArr.get(i);
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void myFun2(int[] arr) {
        int index = 0;
        // Step 1: shift non-zeros forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: fill remaining with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 0, 3, 0, 4, 5 };
        // myFun(arr);
        myFun2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
