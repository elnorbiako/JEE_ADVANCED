package pl.coderslab.s3ex1;

public class VirtualProduct implements Product {
    private String name;
    private double value;
    private String atWebsiteName;


    public VirtualProduct(String name, double value) {
        this.setName(name);
        this.setValue(value);
    }

    public String getAtWebsiteName() {
        return this.atWebsiteName;
    }

    public Product setAtWebsiteName(String atWebsiteName) {
        this.atWebsiteName = atWebsiteName;
        return this;
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
