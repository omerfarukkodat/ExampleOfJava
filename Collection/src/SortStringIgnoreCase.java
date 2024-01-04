import java.util.ArrayList;
import java.util.List;

public class SortStringIgnoreCase {
    public static void main(String[] args) {
        List<String> cities = java.util
                .Arrays
                .asList("Atlanta", "Istanbul", "Genk", "Savannah", "New York", "Dallas");

        cities.sort(String::compareToIgnoreCase);
        for (String city : cities) {
            System.out.print(city + " ");
        }


    }
}
