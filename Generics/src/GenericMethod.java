// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GenericMethod {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        String [] strings = {"London", "Paris", "New York", "Austin"};

        GenericMethod.<Integer>print(integers);
        GenericMethod.<String>print(strings);
    }

        public static <E> void print(E[] list){
            for (int i =0;i<list.length;i++){
                System.out.print(list[i] + " ");
            }
            System.out.println();
        }

}