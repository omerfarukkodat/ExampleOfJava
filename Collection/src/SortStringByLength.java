import java.util.Comparator;

public class SortStringByLength {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        java.util.Arrays.sort(cities,Comparator.comparing(String::length));
        for (String city: cities){
            System.out.print(city + " ");
    }
    }
}





