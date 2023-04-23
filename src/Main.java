public class Main {
    public static void main(String[] args) {

        TransportInService bicycle = new Bicycle("BMX",2);
        TransportInService bicycle2 = new Bicycle("Школьник",2);

        TransportInService car = new Car("Ford", 4);
        TransportInService car2 = new Car("Nissan", 4);

        TransportInService truck = new Truck("Scania", 6);
        TransportInService truck2 = new Truck("Iveco", 8);

            ServiceStation station = new ServiceStation();
            station.check(bicycle);
            station.check(bicycle2);
            station.check(car);
            station.check(car2);
            station.check(truck);
            station.check(truck2);
    }
}