package pl.coderslab.d2s3ex2;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private String name;
    private String surname;
    private String sex;
    private LocalDate birtday;
    private double sallary;

    public Employee(String name, String surname, String sex, LocalDate birtday, double sallary) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.birtday = birtday;
        this.sallary = sallary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", birtday=" + birtday +
                ", sallary=" + sallary +
                '}';
    }
}
