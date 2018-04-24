package pl.coderslab.d2s2ex1;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String > words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        while (!text.equals("quit") ) {
            words.add(text);
            text = scan.nextLine();
        }
        // sortowanie bąbelkowe
        words.sort( (a,b) -> a.compareToIgnoreCase(b) );

        words.forEach( value -> System.out.println(value) );
    }
}
