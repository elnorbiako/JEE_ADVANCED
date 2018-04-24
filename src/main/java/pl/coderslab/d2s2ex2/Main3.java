package pl.coderslab.d2s2ex2;

import java.util.function.Predicate;

public class Main3 {



    public static void main(String[] args) {

        printValue("Hello", val -> (val instanceof String) == false);
        printValue(100, val -> (val instanceof Number) == true);
    }


    static void  printValue(Object value, Predicate<Object> f){
        if (f.test(value) ) {
            System.out.println( value);
        }
    }
}


