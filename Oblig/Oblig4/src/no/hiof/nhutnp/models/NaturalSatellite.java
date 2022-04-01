package no.hiof.nhutnp.models;

public abstract class NaturalSatellite extends CelestialBody {
    protected double semiMajorAxis;
    protected double eccentricity;
    protected int orbitalPeriod;
    protected Star centralCelestialBody;
    protected static final int AU = 149_597_871;
    protected static final double GRAVITY = 6.67408E-11;

    protected NaturalSatellite(String name, double radius, double mass, double semiMajorAxis,
                            double eccentricity, int orbitalPeriod, Star centralCelestialBody) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public double distanceToCentralBody(double degrees){
        return (semiMajorAxis * (1 - Math.pow(eccentricity, 2)) / (1 + (eccentricity * Math.cos(Math.toRadians(degrees))))) * AU;

    }

    public void printDistanceToCentralBody(double degrees){
        System.out.println(name + " has a distance of " + distanceToCentralBody(degrees) + "km to the "
                + centralCelestialBody.getName() + " at " + degrees + " degrees.");
    }

    public double orbitingVelocity(double distance){
        double v = Math.sqrt((GRAVITY * centralCelestialBody.getMassInKg()) / (distance * 1000));
        return v / 1000;
    }

    public void printOrbitingVelocity(double distance){
        System.out.println("At a distance of " + distance + "km, " + name + " has a velocity of " + orbitingVelocity(distance) + "km/s");
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Star getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(Star centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }
}
