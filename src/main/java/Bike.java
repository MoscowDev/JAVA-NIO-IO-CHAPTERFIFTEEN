public class Bike implements Vehicle {
    @Override
    public void accelerate(double distance) {
        System.out.println(String.format("Bike accelerated with distance: %.2f kms", distance)  );
    }
}
