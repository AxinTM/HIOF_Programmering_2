package no.hiof.nhutpham.models;

public class Star {
   private String name;
   private double radius;
   private double mass;
   private int effectiveTemp;
   private double msun = 1.98892E30;
   private double rsun = 695700;

    public Star(String name, double radius, double mass, int effectiveTemp){
       this.name = name;
       this.radius = radius;
       this.mass = mass;
       this.effectiveTemp = effectiveTemp;

   }

   public void printStar() {
        System.out.println("This Solar System has a star named " + name + " with: \nradius: " + getSunRadius() +
                "km \nmass: " + getSunMass() + "kg \neffective temp: " + effectiveTemp + " Celsius");
    }

    public double getSunMass(){
       return this.mass*msun;
    }

    public double getSunRadius(){
       return this.radius*rsun;
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

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
