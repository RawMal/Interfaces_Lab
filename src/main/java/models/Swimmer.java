package models;


import interfaces.ISwim;

public class Swimmer implements ISwim {

    private String name;

    public Swimmer(String name){
        this.name = name;
    }

    public String swim(int distance){
        return String.format("%s swam %sm", this.name, distance);
    }





}
