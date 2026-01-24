package com.generics.resumescreeningsystem;

import java.util.List;

class ScreeningPipeline {

    public static void processRoles(
            List<? extends JobRole> roles) {

        for (JobRole role : roles) {
            System.out.println("Pipeline processing: " + role.getRoleName());
            role.screen();
        }
    }
}

