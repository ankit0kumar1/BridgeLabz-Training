package com.smarthomeautomation;

public class SmartHomeApp {

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(90);
        Appliance ac = new AC();

        UserController controller = new UserController();

        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        System.out.println();
        light.deviceStatus();
        fan.deviceStatus();
        ac.deviceStatus();

        System.out.println();
        controller.compareEnergy(ac, light);
    }
}
