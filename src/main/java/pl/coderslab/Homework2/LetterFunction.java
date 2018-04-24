package pl.coderslab.Homework2;

import java.util.function.Function;

public class LetterFunction implements Function {

    @Override
    public Object apply(Object o) {
        String newString = (String) o.toString().toLowerCase().subSequence(2, o.toString().length()-2);

        return newString;
    }


}

