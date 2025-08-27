import java.util.HashSet;

public class A04_UnionOfTwoarrays {
    public static void myFun(int[] arr1, int[] arr2) {
        HashSet<Integer> myUnionSet = new HashSet<>();
        for (int elem : arr1) {
            myUnionSet.add(elem);
        }
        for (int elem : arr2) {
            myUnionSet.add(elem);
        }
        System.out.println(myUnionSet);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 5, 7, 9 };
        myFun(arr1, arr2);
    }
}