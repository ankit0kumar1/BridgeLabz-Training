package com.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("data.txt")) {

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

