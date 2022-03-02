package no.hiof.nhutpham.forelesning08.models;

public class CarpenterApprentice extends Carpenter {

    private String apprenticeTime;
    private int houseDestroyed;

    public CarpenterApprentice(String name, String lastName, int age, int totalHouseBuild, String apprenticeTime, int houseDestroyed) {
        super(name, lastName, age, totalHouseBuild);

        this.apprenticeTime = apprenticeTime;
        this.houseDestroyed = houseDestroyed;
    }

    public String getApprenticeTime() {
        return apprenticeTime;
    }

    public void setApprenticeTime(String apprenticeTime) {
        this.apprenticeTime = apprenticeTime;
    }

    public int getHouseDestroyed() {
        return houseDestroyed;
    }

    public void setHouseDestroyed(int houseDestroyed) {
        this.houseDestroyed = houseDestroyed;
    }
}
