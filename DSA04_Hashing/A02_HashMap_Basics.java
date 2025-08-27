//// === NOTES === ////
/// Creating --> HashMap<Integer, String> HashMapVarName = new HashMap<>();
/// Get Value from key --> HashMapVarName.get(0)
/// Search key present or Not --> HashMapVarName.containsKey(0)
/// Search value present or Not --> HashMapVarName.containsValue("Mohan")
/// Set of keys --> HashMapVarName.keySet()
/// set of Values --> HashMapVarName.values()
/// Removal with key --> HashMapVarName.remove(2);
/// update using put(m1) --> HashMapVarName.put(4, "Shivam Verma");
/// update using replace(m2) --> HashMapVarName.replace(5, "Mohan Kumar");
/// getting size --> HashMapVarName.size()
/// checking Empty --> HashMapVarName.isEmpty()
/// cloning --> HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) HashMapVarName.clone();
/// clearing --> clonedMap.clear();

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class A02_HashMap_Basics {
    public static void main(String[] args) {

        // Creation
        HashMap<Integer, String> StudentsData = new HashMap<>();
        StudentsData.put(1, "Amrit");
        StudentsData.put(2, "Rohit");
        StudentsData.put(3, "Kartik");
        StudentsData.put(4, "Shivam");
        StudentsData.put(5, "Mohan");

        // Print (M1)
        System.out.println("\n=== print (M1) ===");
        System.out.println(StudentsData);

        // Print (M2 - for each loop)
        System.out.println("\n=== print (M2 - for each) ===");
        for (Map.Entry<Integer, String> entry : StudentsData.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Print (M3 - Iterator)
        System.out.println("\n=== print (M3 - iterator) ===");
        Iterator<Map.Entry<Integer, String>> it = StudentsData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Roll: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Print (M4 - Java 8 forEach)
        System.out.println("\n=== print (M4 - Java 8 forEach) ===");
        StudentsData.forEach((roll, name) -> {
            System.out.println("Roll: " + roll + ", Name: " + name);
        });

        // Searching by Key
        System.out.println("\n=== Searching Roll No 3 ===");
        int searchRoll = 3;
        if (StudentsData.containsKey(searchRoll)) {
            System.out.println("Yes, Roll " + searchRoll + " is present. Name = " + StudentsData.get(searchRoll));
        } else {
            System.out.println("Roll " + searchRoll + " is NOT present.");
        }

        // Searching by value
        System.out.println("\n=== Searching by value (Mohan) ===");
        System.out.println("Is Mohan present? " + StudentsData.containsValue("Mohan"));

        // Iterating only keys and values
        System.out.println("\n=== Keys and Values separately ===");
        System.out.println("All Roll Numbers: " + StudentsData.keySet());
        System.out.println("All Student Names: " + StudentsData.values());

        // Removal
        System.out.println("\n=== Removal of Roll No 2 (Rohit) ===");
        System.out.println("Before Removal: " + StudentsData);
        StudentsData.remove(2);
        System.out.println("After Removal: " + StudentsData);

        // Update using put
        System.out.println("\n=== Update Roll No 4 (Shivam -> Shivam Verma) ===");
        System.out.println("Before Update: " + StudentsData);
        StudentsData.put(4, "Shivam Verma"); // update
        System.out.println("After Update: " + StudentsData);

        // Update using replace
        System.out.println("\n=== Update Roll No 5 using replace() (Mohan -> Mohan Kumar) ===");
        StudentsData.replace(5, "Mohan Kumar");
        System.out.println("After replace: " + StudentsData);

        // Size
        System.out.println("\n=== Size of HashMap ===");
        System.out.println("Size = " + StudentsData.size());

        // isEmpty
        System.out.println("\n=== isEmpty() check ===");
        System.out.println("Is HashMap empty? " + StudentsData.isEmpty());

        // Clone
        System.out.println("\n=== clone() ===");
        @SuppressWarnings("unchecked")
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) StudentsData.clone();
        System.out.println("Original HashMap: " + StudentsData);
        System.out.println("Cloned HashMap: " + clonedMap);

        // Clear
        System.out.println("\n=== clear() ===");
        clonedMap.clear();
        System.out.println("After clearing clonedMap");
        System.out.println("Original = " + StudentsData);
        System.out.println("clonedMap = " + clonedMap);
    }
}