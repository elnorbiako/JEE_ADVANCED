package pl.coderslab.d2ex1;

public class NumberFilter implements Filter {

//    @Override
//    public boolean check(Object o) {
//        return false;
//    }

    @Override
    public boolean check(Object v) {
        return (int) v < 20;
    }
}