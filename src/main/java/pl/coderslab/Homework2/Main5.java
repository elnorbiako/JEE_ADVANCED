package pl.coderslab.Homework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main5 {


    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        List<T> newSearch = new ArrayList<>();
        for (T s : collection) {
            if (predicate.test(s)) {
                newSearch.add(s);
            }
        }
        return newSearch;
    }


    static <S, T> List<T> changeCollection(Collection<T> collection, Function<S, T> function) {
        List<T> newCollection = new ArrayList<>();
        for (T s : collection) {
                function.check(S, s) {
                newCollection.add(s);
            }
        }
        return newCollection;

    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {

        for (T s : collection) {
           consumer.   check(S, s) {
                newCollection.add(s);
            }
        }
    }
}
