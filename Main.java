import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Passenger> passengers = new ArrayList<>();


        Route route1 = new Route("Riyadh , Hittin-3961 ", "Riyadh Park mall", 25.0);
        Route route2 = new Route("Riyadh , King Abdullah Road - 1234 ", "Riyadh Boulevard ", 82);
        Route route3 = new Route("Riyadh , Almlqa 5674 ", "Dammam , Abhor0012", 1320);

        Car car1 = new Car("jeep123", route1, 4);
        Car car2 = new Car("Mazda789", route2, 0);
        Car car3 = new Car("BMW0015", route3, 3);

        Passenger subscriber = new Subscriber(1, "Mohammed Ali");
        Passenger nonSubscriber = new NonSubscriber(2, "Abdullah Ahmed", false);
        Passenger nonSubscriber2 = new NonSubscriber(3, "Fahad Abdulrahman", true);

        passengers.add(subscriber);
        passengers.add(nonSubscriber);
        passengers.add(nonSubscriber2);

        subscriber.reserveCar(car1);
        nonSubscriber.reserveCar(car2);
        nonSubscriber2.reserveCar(car3);


        for (Passenger passenger : passengers) {
            passenger.displayInfo();
            System.out.println();
        }
    }
}