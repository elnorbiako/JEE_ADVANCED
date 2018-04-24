package pl.coderslab.d2s3ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("test");
        words.add("abażur");
        words.add("sekstans");
        words.add("kabestan");
        words.add("baryłka");
        words.add("telewizor");
        words.add("mazur");
        words.add("tango");

        //p1
        words.stream()
                .filter( text -> (text.charAt(0) == 'a' || text.charAt(0) == 's' ) )
                .sorted()
                .forEach( text -> System.out.println( text.toUpperCase() ));

        //p2
        List<String> filteredWords = words.stream()
                .distinct()
                .filter(text -> text.length() == 5)
                .collect( Collectors.toList() );

        filteredWords.forEach( System.out::println );

        //p3
        String newText = words.stream()
                .map( el -> el.substring(0,3) )
                .sorted()
                .collect( Collectors.joining( ",") );

        System.out.println(newText);


    }
}
