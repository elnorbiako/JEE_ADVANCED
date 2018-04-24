package pl.coderslab.d2s3ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("test");
        words.add("abażur");
        words.add("sekstans");
        words.add("kabestan");
        words.add("baryłka");
        words.add("telewizoreczek");
        words.add("mazur");
        words.add("tango");


        System.out.println("============p1================");
        words.stream()
                .forEach(text -> System.out.print(text.length() + ", "));


        System.out.println("");


        System.out.println("============p2================");
        words.stream()
                .sorted()
                .forEach(text -> System.out.print(text + ", "));
        System.out.println("");


        System.out.println("============p3================");
        words.stream()
                .filter(text -> (text.contains("c")))
                .forEach(System.out::println);
        System.out.println("");


        System.out.println("============p4================");

        int total = words.stream().mapToInt(String::length).sum();
        System.out.println(total);


        System.out.println("============p5================");

        words.stream()
                .limit(3)
                .sorted()
                .forEach(text -> System.out.print(text + ", "));
        System.out.println("");



    }
}
