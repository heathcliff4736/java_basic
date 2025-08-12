package java_advanced_01.day13.interfaceEx01;

import java_advanced_01.day13.ABCD.A;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(bus);
        vehicleList.add(bus);
        vehicleList.add(bus);
        vehicleList.add(bus);

//        vehicle = (Vehicle)vehicleList[0];

    }
}
