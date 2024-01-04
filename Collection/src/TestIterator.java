import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList<>();
        collection.add("Paris");
        collection.add("Los Angeles");
        collection.add("London");
        collection.add("Istanbul");

        System.out.println(collection);

        Iterator <String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase() + " , ");
        }
        // foreach(String element : collection){
        // System.out.print(element.toUpperCase() + " , " );
        System.out.println();

    }
}
