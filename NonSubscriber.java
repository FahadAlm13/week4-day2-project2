public class NonSubscriber extends Passenger {
    private boolean discount;

    public NonSubscriber(int id, String name, boolean discount) {
        super(id, name);
        this.discount = discount;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        try {
            if (car.getMaximum_capacity() <= 0) {
                throw new Exception("Sorry, The car " + car.getCode() + " has reached its maximum capacity" );
            }else {
                setReserved_car_object(car);
                double tripCost = car.getRoute().getTrip_price();
                if (discount) {
                    tripCost -= car.getRoute().getTrip_price() * 0.1;
                }
                setTrip_cost(tripCost);
                car.setMaximum_capacity(car.getMaximum_capacity() - 1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
