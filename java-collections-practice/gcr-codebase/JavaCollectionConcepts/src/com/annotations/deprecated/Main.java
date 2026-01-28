package com.annotations.deprecated;

public class Main {
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   //  This will show a deprecated warning
        api.newFeature();   //  Recommended
    }
}

