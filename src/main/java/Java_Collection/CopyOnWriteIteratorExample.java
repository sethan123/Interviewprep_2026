package Java_Collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteIteratorExample {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Java");
        list.add("Selenium");
        list.add("API");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println("Reading: " + value);

            // Modifying while iterating
            if (value.equals("Selenium")) {
                list.add("Testing");
                System.out.println("Added: Testing");
            }
        }

        System.out.println("Final List: " + list);
    }
}