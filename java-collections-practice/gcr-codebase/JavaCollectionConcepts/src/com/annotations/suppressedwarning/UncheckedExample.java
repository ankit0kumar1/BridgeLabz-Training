package com.annotations.suppressedwarning;

import java.util.ArrayList;

public class UncheckedExample {

    @SuppressWarnings("unchecked")
    public void demo() {

        ArrayList list = new ArrayList();  // Raw type (no generics)

        list.add("Java");
        list.add(100);   // Allowed because no generics
        list.add(true);

        System.out.println(list);
    }
}

