package pl.coderslab.Homework2;

public class NumberFunction implements Function {

    @Override
    public boolean check(Object v) {
        return (int) v < 100 && (int) v > 0;
    }
}