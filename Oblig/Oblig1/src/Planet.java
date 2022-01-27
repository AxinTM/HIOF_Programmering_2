public class Planet {
    private String name;
    private float radius;
    private double mass;

    public Planet(String name, float radius, double mass){
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }
    public void printInfo(){
        System.out.println("The planet " + name + " has a radius of " + radius +
                " km and the mass is " + mass + " kg");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

}