package no.hiof.nhutpham.forelesning07.models;

public class Carpenter extends Person {

    private int totalHouseBuild;

    public Carpenter(String name, String lastName, int age, int totalHouseBuild) {
        super(name, lastName, age);

        this.totalHouseBuild = totalHouseBuild;
    }

    public int getTotalHouseBuild() {
        return totalHouseBuild;
    }

    public void setTotalHouseBuild(int totalHouseBuild) {
        this.totalHouseBuild = totalHouseBuild;
    }
}