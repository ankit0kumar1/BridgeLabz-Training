package com.annotations.deprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is running (Deprecated)");
    }

    public void newFeature() {
        System.out.println("New feature is running (Recommended)");
    }
}

