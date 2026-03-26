package Java_Collection;
import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Selenium");
        list.add("API");
        list.add("Testing");
        list.add("DevOps");

        // Get sublist (index 1 to 4)
        List<String> sub = list.subList(1, 4);

        System.out.println("Original List: " + list);
        System.out.println("Sub List: " + sub);
    }
}