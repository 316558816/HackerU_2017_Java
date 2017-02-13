package com.company;

/**
 * Created by MyUser on 13/02/2017.
 */
public class City extends Point {
    private int numOfCitizens;
    Point point;
    private String name;


    public City() {
        if(numOfCitizens>=0)
            this.numOfCitizens = numOfCitizens;
        this.point = point;
        this.name = name;
    }


    /* copy constructor */



    public int getNumOfCitizens() {
        return numOfCitizens;
    }

    public void setNumOfCitizens(int numOfCitizens) {
        this.numOfCitizens = numOfCitizens;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
