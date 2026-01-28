package com.annotations.roleallowed;

@RoleAllowed("ADMIN")
public class AdminService {

    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    public void viewAllReports() {
        System.out.println("All reports displayed!");
    }
}

