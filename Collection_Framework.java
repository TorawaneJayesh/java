/*The Java Collections Framework is a group of classes and interfaces used
  to store, manipulate, and process objects.
   */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
public class Collection_Framework {
    public static void main(String args []){

    ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);
        /*add() , remove() , get() , set() , size()*/

    LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);

    HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set);
    
    HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        System.out.println(map);
    }
    
}
