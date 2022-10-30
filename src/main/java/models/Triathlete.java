package models;


import interfaces.ICycle;
import interfaces.IRun;
import interfaces.ISwim;

public class Triathlete implements ICycle, IRun, ISwim {

    private String name;

    public Triathlete(String name){
        this.name = name;
    }

    public String cycle(int distance){
        return String.format("%s cycled %sm after swimming", this.name, distance);
    }

    public String run(int distance){
        return String.format("%s ran %sm after cycling", this.name, distance);
    }
    public String swim(int distance){
        return String.format("%s swam %sm from the start", this.name, distance);
    }

}

