package com.callcenter;

import java.util.Scanner;

public class CallCenterApp {
    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();

        Customer c1 = new Customer("C101", "Ravi", false);
        Customer c2 = new Customer("C102", "Neha", true);
        Customer c3 = new Customer("C103", "Amit", false);
        Customer c4 = new Customer("C102", "Neha", true); // repeat call

        callCenter.receiveCall(c1);
        callCenter.receiveCall(c2);
        callCenter.receiveCall(c3);
        callCenter.receiveCall(c4);

        callCenter.serveNextCall();
        callCenter.serveNextCall();
        callCenter.serveNextCall();

        callCenter.getCustomerCallCount("C102");
    }
}
