package pl.coderslab.homework1;

public class Person implements Comparable<Person>   {

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "lastName= " + lastName + " firstName, = " + firstName ;
    }

    @Override
    // it is working, but question is why?
    // is there some influence to sort array?
    public int compareTo(Person other) {
        int compareInt = this.firstName.compareTo(other.firstName);
        if (compareInt < 0) return -1;
        if (compareInt > 0) return 1;
        return 0;
    }
}
