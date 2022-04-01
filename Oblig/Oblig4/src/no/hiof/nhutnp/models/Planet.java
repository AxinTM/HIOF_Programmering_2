package no.hiof.nhutnp.models;

public class Planet extends NaturalSatellite {
    private static final double MJUP = 1.898E27;
    private static final double RJUP = 71492;




    public Planet(String name, double radius, double mass, double semiMajorAxis,
                  double eccentricity, int orbitalPeriod, Star centralCelestialBody){
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);

    }

    @Override
    public String toString() {
        return "The planet " + name + " has:" +" \nradius: " + getRadiusInKm() + "km \nmass: " + getMassInKg() + "kg";

    }

    public void printSurfaceGravity(){
        System.out.println("The Surface gravity of " + name + " is " + getSurfaceGravity() );
    }

    public double getMassInKg(){
        return this.mass* MJUP;
    }

    public double getRadiusInKm(){
        return this.radius* RJUP;
    }

    public double getSurfaceGravity(){
        return (GRAVITY * getMassInKg())/Math.pow(getRadiusInKm(), 2);
    }

    @Override
    public int compareTo(CelestialBody o){
        if (this.radius < o.radius){
            return -1;
        }
        else if (this.radius > o.radius){
            return 1;
        }
        else{
            return 0;
        }
    }
}
