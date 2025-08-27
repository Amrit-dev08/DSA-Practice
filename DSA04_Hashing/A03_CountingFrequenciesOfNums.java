import java.util.HashMap;

class A03_CountingFrequenciesOfNums {
    public static void myFun(int[] arr) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int elem : arr) {
            if (myMap.containsKey(elem)) {
                myMap.put(elem, myMap.get(elem) + 1);
            } else {
                myMap.put(elem, 1);
            }
        }
        System.out.println("Final : " + myMap);

        // Extra check for more than N/3 iterations.
        for (int elem : myMap.keySet()) {
            if (myMap.get(elem) > arr.length / 3) {
                System.out.println(elem + " Comes more than " + arr.length / 3 + " times");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 1, 2, 1, 2, 5, 1, 2, 2, 1 };
        myFun(arr);
    }
}
