
import java.util.HashMap;
import java.util.Map;

public class A07_FindingMaxAndMinFrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 2, 1, 2, 1, 2, 2, 2, 3, 2, 1, 2, 1, 3, 2, 3, 2, 1, 3, 2, 2, 1, 3, 1, 1, 2 };
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int j : arr) {
            if (myMap.containsKey(j)) {
                myMap.put(j, myMap.get(j) + 1);
            } else {
                myMap.put(j, 1);
            }
        }
        System.out.println(myMap);

        int maxKey = -1, minKey = -1;
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (maxFreq < value) {
                maxFreq = value;
                maxKey = key;
            }
            if (minFreq > value) {
                minFreq = value;
                minKey = key;
            }
        }
        System.out.println("Maxkey is " + maxKey + " with " + maxFreq + " Frequency");
        System.out.println("minKey is " + minKey + " with " + minFreq + " Frequency");

    }
}
