package Java_Collection;


import java.util.*;
public class CompareHashmap {
 public static void main(String[] args) {
    HashMap<String,Integer> map1 = new HashMap<String,Integer>();
    map1.put("Chethan",1);
    map1.put("Monk",2);
    map1.put("Test",3);
    
    
    HashMap<String,Integer> map2 = new HashMap<String, Integer>();
    map2.put("Test",1);
    map2.put("Chethan",2);
    map2.put("Monk",3);
    List<Integer> list1 = new ArrayList<>(map1.values());
    List<Integer> list2 = new ArrayList<>(map2.values());

    Collections.sort(list1);
    Collections.sort(list2);
    
    System.out.println(map1.equals(map2));
    System.out.println(map1.keySet().equals(map2.keySet()));
    System.out.println(map1.values().equals(map2.values()));
    
    
    HashMap<String,Integer> map3 = new HashMap<String, Integer>();
    map3.put("Chethan",1);
    map3.put("Monk",2);
    
    
    HashSet<String> set1 = new HashSet<>(map1.keySet());
    set1.addAll(map3.keySet());
    System.out.println(set1);
    
    
 }
}