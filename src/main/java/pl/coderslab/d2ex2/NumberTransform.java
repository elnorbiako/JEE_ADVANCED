package pl.coderslab.d2ex2;

import pl.coderslab.d2ex1.Filter;

public class NumberTransform implements Filter, Transform {
    @Override
    public boolean check(Object o) {
        return false;
    }

    @Override
    public Object change(Object o) {
        return (double) o-1;

        }

}
