public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack <Integer> genericStack = new GenericStack<>();
        genericStack.push(23);
        genericStack.push(34);
        genericStack.push(45);
        genericStack.push(12);

    print(genericStack);
    }
    public static void print(GenericStack<?> genericStack ){

        while (!genericStack.isEmpty()){
            System.out.print(genericStack.pop() + " ");
        }


    }


}
