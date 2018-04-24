package pl.coderslab.d2ex2;

@FunctionalInterface
public interface Transform<T, S> {

    T change(S s);
}