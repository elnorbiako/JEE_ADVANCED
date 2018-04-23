package pl.coderslab.s3ex1;

public class AdvanceProduct implements Product {

    private String name;
    private double value;


    public AdvanceProduct(String name, double value) {
        this.setName(name);
        this.setValue(value);
    }

    @Override
    public Product setValue(double value) {
        this.value = value;
        return this;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public Product setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }
}


