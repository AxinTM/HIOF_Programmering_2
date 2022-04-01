package no.hiof.nhutpham.forelesning19.models;

import java.sql.Array;
import java.util.ArrayList;

public class Superhero {
    private String name;
    private String alterEgo;
    private ArrayList<Superhero> sidekicks = new ArrayList<>();

    public Superhero(String name, String alterEgo) {
        this.name = name;
        this.alterEgo = alterEgo;
    }

    @Override
    public String toString() {
        return "Name " + name + ", alter ego: " + alterEgo +
                ", sidekicks; " + sidekicks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlterEgo() {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    public ArrayList<Superhero> getSidekicks() {
        return sidekicks;
    }

    public void setSidekick(Superhero superHero) {
        this.sidekicks.add(superHero);
    }
}
