package Java_Collection;

import java.util.ArrayList;

public class RetainAllExample {
    public static void main(String[] args) {

        // List 1
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Selenium");
        list1.add("API");
        list1.add("Testing");

        // List 2
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("API");
        list2.add("Postman");

        // Retain common elements
        list1.retainAll(list2);

        // Output
        System.out.println("After retainAll: " + list1);
    }
}