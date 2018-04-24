package pl.coderslab.d2s3ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> newNumb = numbers.stream()
                .filter( n -> (n*n - 5) <20)
                .collect(Collectors.toList());

        newNumb.forEach(System.out::println);


//                .map(n -> n * n - 5)
//                .map(n -> n < 20)
//                .forEach( System.out::println);

    }
}
