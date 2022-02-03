package no.hiof.nhutpham.models;

public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double mjup = 1.898E27;
    private double rjup = 71492;
    private double gravity = 6.67408E-11;

    public Planet(String name, double radius, double mass){
        this.name = name;
        this.radius = radius;
        this.mass = mass;

    }

    public void printPlanet() {
        System.out.println("The planet " + name + " has:" +" \nradius: " + getPlanetRadius() + "km \nmass: " + getPlanetMass() + "kg");
    }

    public void printSurfaceGravity(){
        System.out.println("The Surface gravity of " + name + " is " + getSurfaceGravity() );
    }

    public double getPlanetMass(){
        return this.mass*mjup;
    }

    public double getPlanetRadius(){
        return this.radius*rjup;
    }

    public double getSurfaceGravity(){
        return (gravity*getPlanetMass())/Math.pow(getPlanetRadius(), 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
