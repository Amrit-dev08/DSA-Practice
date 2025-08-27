
import java.util.HashSet;

public class A05_IntersectionofTwoArrays {
    public static void myFun1(int[] arr1, int[] arr2) {
        HashSet<Integer> myIntersectionSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    myIntersectionSet.add(arr1[i]);
                }
            }
        }
        System.out.println("with Nesting -> " + myIntersectionSet);
    }

    public static void myFun2(int[] arr1, int[] arr2) {
        HashSet<Integer> myIntersectionSet = new HashSet<>();
        HashSet<Integer> arr1Set = new HashSet<>();
        for (int elem : arr1) {
            arr1Set.add(elem);
        }
        for (int elem : arr2) {
            if (true) {
                if (arr1Set.contains(elem)) {
                    myIntersectionSet.add(elem);
                }
            }
        }
        System.out.println("without Nesting -> " + myIntersectionSet);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 3, 5, 7, 9 };
        myFun1(arr1, arr2);
        myFun2(arr1, arr2);
    }
}