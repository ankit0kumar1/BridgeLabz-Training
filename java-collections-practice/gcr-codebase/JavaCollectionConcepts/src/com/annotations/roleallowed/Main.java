package com.annotations.roleallowed;

public class Main {
    public static void main(String[] args) {

        AdminService service = new AdminService();

        // Case 1: USER trying to access ADMIN service
        UserContext.setRole("USER");
        System.out.println("Current Role: " + UserContext.getRole());
        AccessManager.execute(service, "deleteUser");

        System.out.println("------------------");

        // Case 2: ADMIN accessing ADMIN service
        UserContext.setRole("ADMIN");
        System.out.println("Current Role: " + UserContext.getRole());
        AccessManager.execute(service, "deleteUser");
    }
}

