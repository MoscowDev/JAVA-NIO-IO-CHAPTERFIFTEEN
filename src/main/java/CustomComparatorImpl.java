public class CustomComparatorImpl {
    public static void main(String[] args) {
        Vehicle vehicle = (double distance) ->{
            System.out.println("Vehicle is accelerated for " + distance + "KM");
        };
        //vehicle.accelerate(110);
        printDistanceCoveredBy((double distance)->{
            System.out.println("Vehicle is accelerated for " + distance + "KM");
        });
        Vehicle keke = (double distance)->{
            System.out.println("Bike keke accelerated with distance: " + distance);
        };
            keke.accelerate(50);

        Vehicle cyberTruck = (double distance)->{
            System.out.println("vehicle cyberTruck accelerated with distance: " + distance);
        };
            cyberTruck.accelerate(50);

        Vehicle formula1 = (double distance)->{
            System.out.println("vehicle formula1 accelerated with distance: " + distance);
        };
            formula1.accelerate(50);
        Vehicle cityBus = (double distance)->{
            System.out.println("Vehicle cityBus accelerated with distance: " + distance);
        };
        cityBus.accelerate(50);
    }
    private static void printDistanceCoveredBy(Vehicle vehicle) {
         vehicle.accelerate(10);


    }




}
