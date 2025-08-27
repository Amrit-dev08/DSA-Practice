import java.util.HashMap;

public class A06_Find_PathFrom_keyValuePairs {

    public static void myFun(HashMap<String, String> myMap) {
        System.out.println("Input Map: " + myMap);
        String start = null;

        // Find starting point (key that never appears as a value)
        for (String key : myMap.keySet()) {
            if (!myMap.containsValue(key)) {
                start = key;
                break;
            }
        }

        // Traverse until destination is null
        while (start != null) {
            String next = myMap.get(start);
            if (next == null)
                break;
            System.out.println(start + " --> " + next);
            start = next;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        // Moon->Mumbai->Delhi->Goa->Chennai->Bengaluru->Sun
        myMap.put("Chennai", "Bengaluru");
        myMap.put("Mumbai", "Delhi");
        myMap.put("Goa", "Chennai");
        myMap.put("Delhi", "Goa");
        myMap.put("Moon", "Mumbai");
        myMap.put("Bengaluru", "Sun");

        myFun(myMap);
    }
}
