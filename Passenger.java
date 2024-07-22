public abstract class Passenger {
    private String name;
    private int id;
    private Car reserved_car_object;
    private double trip_cost;

    public Passenger( int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void reserveCar(Car car) throws Exception;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getReserved_car_object() {
        return reserved_car_object;
    }

    public void setReserved_car_object(Car reserved_car_object) {
        this.reserved_car_object = reserved_car_object;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        if (reserved_car_object != null) {
            System.out.println("Car code : " + reserved_car_object.getCode());
            System.out.println("Route price : " + reserved_car_object.getRoute().getTrip_price());
            System.out.println("Trip price : " + trip_cost);
            System.out.println("We have left just :" + reserved_car_object.getMaximum_capacity() + " spaces");
            System.out.println();
        }else System.out.println("Sorry, You can't book here because it's full \n");
    }
}
