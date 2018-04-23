package pl.coderslab.entity;

public class Car extends Vehicle {
    public String type;

    public Car(String model,int maxSpeed, String type) {

        this.setType(type);
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
