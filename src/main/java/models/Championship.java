package models;

import interfaces.ICycle;
import interfaces.IRun;
import interfaces.ISwim;

import java.util.ArrayList;

public class Championship {

    private String name;
    private ArrayList<ICycle> cyclists;
    private ArrayList<IRun> runners;
    private ArrayList<ISwim> swimmers;

    public  Championship(String name){
        this.name = name;
        this.cyclists = new ArrayList<>();
        this.runners = new ArrayList<>();
        this.swimmers = new ArrayList<>();
    }

    public void addSwimmer(ISwim swimmer){
        this.swimmers.add(swimmer);
    }

    public ArrayList<ISwim> getSwimmers(){
        return this.swimmers;
    }

}
