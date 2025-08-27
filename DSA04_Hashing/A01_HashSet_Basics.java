package DSA04_Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class A01_HashSet_Basics {
    public static void main(String[] args) {

        // Creation
        HashSet<String> names = new HashSet<>();
        names.add("Amrit");
        names.add("Rohit");
        names.add("Kartik");
        names.add("Amrit");// duplicates not allowed

        // print (M1)
        System.out.println();
        System.out.println("=== Simple print ===");
        System.out.println(names);

        // print (M2)
        System.out.println("=== For Each Print ===");
        for (String i : names) {
            System.out.print(i + ", ");
        }

        // print (M3)
        System.out.println();
        System.out.println("=== Iterator Print ===");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        // Searching
        System.out.println("\n");
        System.out.println("=== Searching... ===");
        String findName = "Amrit";
        if (names.contains(findName)) {
            System.out.println("Yes " + findName + " is present");
        } else {
            System.out.println(findName + " is Not present");
        }

        // Remove
        System.out.println();
        System.out.println("=== Removal of Rohit & Kartik ===");
        System.out.println(names + " <-- Orignal");
        names.remove("Rohit");
        System.out.println(names + " <-- Removed Rohit");
        names.remove("Kartik");
        System.out.println(names + " <-- Removed Kartik");

        // Update (remove+add)
        System.out.println();
        System.out.println("=== update \"Amrit\" to \"Amrit Anand\". ===");
        System.out.println(names+" <-- Before Update");
        names.remove("Amrit");
        names.add("Amrit Anand");
        System.out.println(names+" <-- After Update");

        // Size
        System.out.println();
        System.out.println("=== Getting Size of (names) HashSet ===");
        System.out.println("Size of HashSet is = " + names.size());

        // Check if empty
        System.out.println();
        System.out.println("=== isEmpty() Check ===");
        System.out.println("Is (names) HashSet empty? " + names.isEmpty());

        // Clone the HashSet
        System.out.println();
        System.out.println("=== clone() ===");
        HashSet<String> clonedSet = (HashSet<String>) names.clone();
        System.out.println("Orignal HashSet: " + names);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Clear the HashSet
        System.out.println();
        System.out.println("=== clear() ===");
        clonedSet.clear();
        System.out.println("After clearing clonedSet");
        System.out.println("Orignal = " + names);
        System.out.println("clonedSet = " + clonedSet);
    }
}
