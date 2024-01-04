import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add("blue");
        arrayList.add("yellow");
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList <Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1,"green");
        linkedList.removeLast();
        linkedList.addFirst("red");
        System.out.println("Display the linked list forward:");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+ " ");
        }
        System.out.println();

        System.out.println("Display the linked list backward:");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+ " ");
        }
        System.out.println();

    }
}
