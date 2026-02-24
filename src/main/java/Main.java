public class Main {
    public static void main(String[] args) {
      Vehicle car = new Car();
      car.accelerate(1000);

      Vehicle wheelbarrow = new Wheelbarrow();
      wheelbarrow.accelerate(1000);

      Vehicle bike = new Bike();
      bike.accelerate(5000);
    }
}
