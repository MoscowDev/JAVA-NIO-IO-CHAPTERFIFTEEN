public class Wheelbarrow implements Vehicle {
    @Override
    public void accelerate(double distance) {
        System.out.println(String.format("Wheelbarrow accelerated at " + distance + " miles/hr"));
    }
}
