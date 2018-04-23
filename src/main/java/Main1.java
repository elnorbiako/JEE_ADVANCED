import pl.coderslab.entity.Car;
import pl.coderslab.entity.Train;
import pl.coderslab.entity.Vehicle;

public class Main1 {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        Car car = new Car("Mazda", 200, "rx300");
        Train train = new Train("EP07", 160, 1435);

        vehicles[0] = car;
        vehicles[1] = train;


        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }

    }
}
