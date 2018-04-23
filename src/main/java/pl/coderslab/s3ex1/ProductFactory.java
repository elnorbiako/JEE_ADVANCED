package pl.coderslab.s3ex1;

public class ProductFactory implements ProductCreator{

    public ProductFactory() {}

    public Product create(String productType, String name, double value){

        switch (productType){

            case "advanced":
                return new AdvanceProduct(name, value);

            case "virtual":
                return new VirtualProduct(name, value);

            case "simple":
            default:
                return new SimpleProduct(name, value);


        }
    }


}
