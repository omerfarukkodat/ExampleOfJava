import java.util.Collections;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] integers = {5, 7, 821, 12, 3, 1, 2 , -1};
        Double[] doubles = {12.23, 5.12, 1.23, 23.34};
        Character[] characters = {'a', 'c', 'z', 'b'};
        String[] strings = {"Rose", "Anna", "Daniel", "Beetlejuice"};

        sort(integers);
        sort(doubles);
        sort(characters);
        sort(strings);

        System.out.print("Sorted Integer objects: ");
        printList(integers);
        System.out.print("Sorted Double objects: ");
        printList(doubles);
        System.out.print("Sorted Characters objects: ");
        printList(characters);
        System.out.print("Sorted String objects: ");
        printList(strings);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;
        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }

            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
