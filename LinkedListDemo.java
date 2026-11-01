import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original: " + numbers);

        numbers.addFirst(10);
        numbers.addLast(50);

        System.out.println("After adding: " + numbers);

        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After removing: " + numbers);

        System.out.println("Size: " + numbers.size());

        Iterator<Integer> It =  Iterator<Integer>();
        while(It.hasNext()){
            System.out.println(It.next());
        }
    }
}