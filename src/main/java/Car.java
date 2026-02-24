public class Car implements Vehicle {
    @Override
    public void accelerate(double distance) {
        System.out.println( " Car accelerated at " + distance + " miles/hr");
    }
}
