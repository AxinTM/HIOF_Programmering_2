package no.hiof.nhutnp.models;

public class Star extends CelestialBody{
    private int effectiveTemp;
    private static final double MSUN = 1.98892E30;
    private static final double RSUN = 695700;

    public Star(String name, double radius, double mass, int effectiveTemp){
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;

    }
    @Override
    public String toString() {
        return "This Solar System has a star named " + name + " with: \nradius: " + getRadiusInKm() +
                "km \nmass: " + getMassInKg() + "kg \neffective temp: " + effectiveTemp + " Celsius";

    }

    public double getMassInKg(){

        return this.mass* MSUN;
    }

    public double getRadiusInKm(){

        return this.radius* RSUN;
    }

    public int getEffectiveTemp() {

        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {

        this.effectiveTemp = effectiveTemp;
    }
}
