package com.company;

import lombok.ToString;

@ToString
public class Country {
    public String name;
    public double size;
    public int numberOfCitizens;
    public String continent;

    public void printCountrySize() {
        System.out.println(String.format("Country size = %d", size));
    }

    public void printSizePerCitizen() {
        System.out.println(String.format("Size per citizen %f", size / numberOfCitizens));
    }
}
