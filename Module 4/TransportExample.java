class Transport {
    void move() {
        System.out.println("Transport is moving.");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods.");
    }
}

public class TransportExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();

        System.out.println("Bus Details:");
        bus.move();
        bus.carryPassengers();

        System.out.println("\nTruck Details:");
        truck.move();
        truck.carryGoods();
    }
}
