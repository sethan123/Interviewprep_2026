package Java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//when we use synchronizedList method of Collections class, it returns a thread-safe list that is synchronized. This means that all the methods of the list are synchronized, and only one thread can access the list at a time. This is useful when multiple threads need to access the same list concurrently, as it prevents data corruption and ensures thread safety. However, it is important to note that when iterating over the synchronized list, we need to synchronize on the list object to prevent concurrent modification exceptions.
public class SynchorizedArrayList {
	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
			list.add("Hello");
			list.add("World");
			//synchronized block to iterate over the list
			synchronized (list) {
				Iterator<String> iterator = list.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			}
	}

}
