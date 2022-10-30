package models;

import interfaces.ICycle;

public class Cyclist implements ICycle {

    private String name;

    public Cyclist(String name){
        this.name = name;
    }

    public String cycle(int distance){
        return String.format("%s cycled %sm", this.name, distance);
    }


}
