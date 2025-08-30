// Time Complexity → O(nLogn)
// Space Complexity → O(n)
// Divide into halfs recursively and merge them in sorted manner

import java.util.ArrayList;

public class A07_Merge_Sort {
    public static int[] mergeFun(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        ArrayList<Integer> tempArr = new ArrayList<>();
        // Merging elements into sorted order in ArrayList
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                tempArr.add(arr[left]);
                left++;
            } else {
                tempArr.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            tempArr.add(arr[left]);
            left++;
        }
        while (right <= high) {
            tempArr.add(arr[right]);
            right++;
        }
        // copying sorted data into (arr) from (tempArr)
        for (int i = 0; i < tempArr.size(); i++) {
            arr[low + i] = tempArr.get(i);
        }
        return arr;
    }

    public static int[] myFun(int[] arr, int low, int high) {
        if (low >= high) {
            return arr;
        }
        int mid = (low + high) / 2;
        myFun(arr, low, mid);
        myFun(arr, mid + 1, high);
        mergeFun(arr, low, mid, high);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 2, 5, 4, 6, 8, 7, 9, 3 };
        System.out.println("\nOrignal:");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
        myFun(arr, 0, arr.length - 1);
        System.out.println("\nSorted:");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }
    }
}
