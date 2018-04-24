package pl.coderslab.d2ex2;

import pl.coderslab.d2ex1.Filter;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {


        List<Integer> numbs = new ArrayList<>();

        numbs.add(5);
        numbs.add(7);
        numbs.add(9);
        numbs.add(62);
        numbs.add(34);

        // z number transferem
         NumberTransform nt = new NumberTransform();
         printList(numbs, value -> value >20, value -> nt.change(value) );

        printList(numbs, value -> value >20, value -> value-1);

    }
    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.change(s));
            }
        }
    }

}