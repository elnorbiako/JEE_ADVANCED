package pl.coderslab.d2s3ex2;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Employee emp1 = new Employee("Jan", "Kowalski", "M", LocalDate.parse("1990-01-01"), 3500 );
        Employee emp2 = new Employee("Piotr", "Nowak", "M", LocalDate.parse("1984-02-02"), 4500 );
        Employee emp3 = new Employee("Zofia", "Nowak", "K", LocalDate.parse("1980-03-03"), 4500 );
        Employee emp4 = new Employee("Anna", "Kowalska", "K", LocalDate.parse("1995-03-03"), 2500 );
        Employee emp5 = new Employee("Zygmunt", "Kowalski", "M", LocalDate.parse("2000-03-03"), 2500 );

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("===============p1=============");
        employees.stream()
                .filter( emp -> emp.getSurname().startsWith("N"))
                .forEach( System.out::println);

        System.out.println("===============p2=============");

        employees.stream()
                .filter( emp -> {
                    int age = LocalDate.now().getYear() - emp.getBirtday().getYear();
                    return (age >= 30 && age <= 45);
                })
                .forEach( System.out::println);

        System.out.println("==============p3================");

        List<Employee> newList = employees.stream()
                .map( emp -> {
                    int age = LocalDate.now().getYear() - emp.getBirtday().getYear();
                    if ( age >= 20 && age <= 30 && emp.getSex().equals("K")&& emp.getSallary()<3500) {
                        emp.setSallary( emp.getSallary() * 1.05 );
                        return emp;
                    } else {
                        return emp;
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Before");
        employees.forEach(System.out::println);
        System.out.println("After");
        newList.forEach(System.out::println);

    }
}
