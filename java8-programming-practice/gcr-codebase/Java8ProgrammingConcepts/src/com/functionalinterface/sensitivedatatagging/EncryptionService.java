package com.functionalinterface.sensitivedatatagging;

//Encryption Processor
class EncryptionService {

 public static void process(Object obj) {

     if (obj instanceof SensitiveData) {
         System.out.println("Sensitive detected! Encrypting -> " + obj.getClass().getSimpleName());
         System.out.println("Encrypted Data: " + encrypt(obj.toString()));
     } else {
         System.out.println("Not sensitive. Storing normally -> " + obj);
     }
 }

 // dummy encryption logic
 private static String encrypt(String data) {
     return data.replaceAll(".", "*"); // just masking for demo
 }
}
