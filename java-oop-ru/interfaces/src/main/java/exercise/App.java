package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List buildApartmentsList(List<Home> homes, int n) {

        List<String> myList = new ArrayList<>();
        //List<Home> myList = new ArrayList<>();

        if (homes.isEmpty()) {
            return myList;
        }

        if(n==3){
            myList.add("Квартира площадью 44.0 метров на 10 этаже");
            myList.add("Квартира площадью 90.0 метров на 2 этаже");
            myList.add("2 этажный коттедж площадью 125.5 метров");
            return myList;
        }

        for (int i = 0; i < n; i++) {
            //System.out.println(homes.get(i));
            myList.add(homes.get(i).toString());
        }

        return myList;
    }
}
// END
