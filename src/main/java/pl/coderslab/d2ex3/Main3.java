package pl.coderslab.d2ex3;

import pl.coderslab.d2ex1.Filter;
import pl.coderslab.d2ex2.Transform;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {


        List<Integer> numbs = new ArrayList<>();

        numbs.add(5);
        numbs.add(7);
        numbs.add(9);
        numbs.add(62);
        numbs.add(34);
    }


    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {

        List<S> src2 = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                // do poprawienia
//                src2.add(t.change(s));}
//            }
//            return src2;
            }
        }
        return null;
    }
}



//    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
//        for (S s : src) {
//            if (f.check(s)) {
//                System.out.println(t.change(s));
//            }

