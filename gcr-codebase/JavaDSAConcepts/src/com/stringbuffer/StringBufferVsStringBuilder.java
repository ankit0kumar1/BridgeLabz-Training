package com.stringbuffer;

public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        // -------- StringBuffer Test --------
        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            buffer.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // -------- StringBuilder Test --------
        StringBuilder builder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            builder.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // -------- Results --------
        System.out.println("StringBuffer time (ns): " + bufferTime);
        System.out.println("StringBuilder time (ns): " + builderTime);
    }
}

