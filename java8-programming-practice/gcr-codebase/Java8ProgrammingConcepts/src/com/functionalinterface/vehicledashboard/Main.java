package com.functionalinterface.vehicledashboard;

public class Main {
    public static void main(String[] args) {

        VehicleDashboard v1 = new PetrolCar();
        VehicleDashboard v2 = new Bus();
        VehicleDashboard v3 = new ElectricCar();

        v1.displaySpeed(80);
        v1.displayBatteryPercentage(0); // default method runs

        v2.displaySpeed(60);
        v2.displayBatteryPercentage(0); // default method runs

        v3.displaySpeed(100);
        v3.displayBatteryPercentage(75); // overridden method runs
    }
}
