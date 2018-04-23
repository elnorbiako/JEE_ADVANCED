package pl.coderslab.entity;

abstract public class Vehicle {
    public int maxSpeed;
    public String model;

    @Override
    public String toString() {
        return this.model + " : " + this.maxSpeed;
    }
}
