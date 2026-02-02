package com.functionalinterface.dataserialization;

public class Main {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("ankit", 20);
        TempSessionData session = new TempSessionData("S12345");

        BackupProcessor.backup(user, "user_backup.ser");
        BackupProcessor.backup(session, "session_backup.ser");
    }
}