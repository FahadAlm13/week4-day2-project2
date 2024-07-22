public class Subscriber extends Passenger{

    public Subscriber( int id, String name) {
        super( id, name);
    }


    @Override
    public void reserveCar(Car car) throws Exception  {
       try {
           if (car.getMaximum_capacity() <= 0 ){
               throw new Exception("Sorry, The car " + car.getCode() + " has reached its maximum capacity " );
           }else {
               setReserved_car_object(car);
               double tripPrice = car.getRoute().getTrip_price() * 0.5;
               setTrip_cost(tripPrice);
               car.setMaximum_capacity(car.getMaximum_capacity() -1 );
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
