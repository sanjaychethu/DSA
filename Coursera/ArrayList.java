import java.util.ArrayList;

public class ArrayList{
    public static void main(String[] args) {
        ArrayList lst = new ArrayList(); // Declaring an ArrayList without specifying a type
        lst.add("ArrayList declaration");  // Adding a String
        lst.add(123); // Adding an Integer
        System.out.println("Basic ArrayList: " + lst);
    }
}

//string only
import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(); // ArrayList for storing Strings only
        stringList.add("Generic List");
        stringList.add(123); // This line would cause a compile-time error
        System.out.println("Generic ArrayList: " + stringList);
    }
}

//initialize

import java.util.ArrayList;

public class CapacityArrayList {
    public static void main(String[] args) {
        ArrayList<String> capacityList = new ArrayList<>(50); // Initialize with an initial capacity of 50
        capacityList.add("Capacity");
        System.out.println("ArrayList with Initial Capacity: " + capacityList);
    }
}