package pl.coderslab.Homework2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");



        System.out.println("=======p1==========");
        filterList(list, val -> val.toString().length() > 4);
        System.out.println("=======p2==========");
        filterList(list, val -> val.toString().contains("c"));
        System.out.println("=======p3==========");
        filterList(list, val -> val.toString().endsWith("a"));

    }


    static void filterList(Object value, Predicate<Object> f) {
        for (String s : (List<String>) value) {
            if (f.test(s)) {
                System.out.println(s);
            }
        }
    }
}
