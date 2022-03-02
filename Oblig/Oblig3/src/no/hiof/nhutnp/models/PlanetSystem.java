package no.hiof.nhutnp.models;

import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList();

    public PlanetSystem(String name, Star centerStar, Planet planets){
        this.name = name;
        this.centerStar = centerStar;
        this.planets.add(planets);

    }
    @Override
    public String toString() {
        String output = "This Plantet System has a star named " + centerStar.getName() +
                ", and it have these planets: ";
        for(Planet x : planets ){
            output += "\n-" + x.getName();
        }
        return output;

    }
    public Planet getSmallestPlanet(){
        Planet smallestPlanet = planets.get(0);
        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadiusInKm() < smallestPlanet.getRadiusInKm()) {
                smallestPlanet = currentPlanet;
            } else if (currentPlanet.getRadiusInKm() == smallestPlanet.getRadiusInKm()) {
                if (currentPlanet.getMassInKg() < smallestPlanet.getMassInKg()) {
                    smallestPlanet = currentPlanet;
                }
            }
        }
        return smallestPlanet;
    }

    public Planet getLargestPlanet(){
        Planet largestPlanet = planets.get(0);
        for (int i = 0; i < planets.size(); i++){
            Planet currentPlanet = planets.get(i);
            if (currentPlanet.getRadiusInKm() > largestPlanet.getRadiusInKm()){
                largestPlanet = currentPlanet;
            }
            else if (currentPlanet.getRadiusInKm() == largestPlanet.getRadiusInKm()){
                if (currentPlanet.getMassInKg() > largestPlanet.getMassInKg()){
                    largestPlanet = currentPlanet;
                }
            }
        }
        return largestPlanet;
    }

    public Planet searchPlanetName(String name){
        for ( Planet x:planets) {
            if (name.equalsIgnoreCase(x.getName())){
                return x;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public void addPlanet(Planet planet){
        this.planets.add(planet);
    }

    public void addPlanet(String name, double radius, double mass, double semiMajorAxis,
                          double eccentricity, int orbitalPeriod, Star centralCelestialBody){
        planets.add(new Planet(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody));
    }

}
