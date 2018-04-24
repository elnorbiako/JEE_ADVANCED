package pl.coderslab.d2ex1;

@FunctionalInterface
public interface Filter<V> {

    boolean check(V v);

}