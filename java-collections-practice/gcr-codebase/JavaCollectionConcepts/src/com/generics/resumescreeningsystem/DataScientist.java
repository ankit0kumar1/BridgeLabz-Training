package com.generics.resumescreeningsystem;

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public void screen() {
        System.out.println("Screening statistics, ML models, data analysis");
    }
}
