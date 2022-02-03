package no.hiof.nhutpham.models;

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

    public void printStar() {
        System.out.println("This Plantet System has a star named " + centerStar.getName() +
                ", and it have these planets: ");
        for(Planet x : planets ){
            System.out.println("-" + x.getName());
        }
    }
    public Planet getSmallestPlanet(){
        Planet smallestPlanet = planets.get(0);
        for (int i = 0; i < planets.size(); i++){
            Planet currentPlanet = planets.get(i);
            if (currentPlanet.getPlanetRadius() < smallestPlanet.getPlanetRadius()){
                smallestPlanet = currentPlanet;
            }
            else if (currentPlanet.getPlanetRadius() == smallestPlanet.getPlanetRadius()){
                if (currentPlanet.getPlanetMass() < smallestPlanet.getPlanetMass()){
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
            if (currentPlanet.getPlanetRadius() > largestPlanet.getPlanetRadius()){
                largestPlanet = currentPlanet;
            }
            else if (currentPlanet.getPlanetRadius() == largestPlanet.getPlanetRadius()){
                if (currentPlanet.getPlanetMass() > largestPlanet.getPlanetMass()){
                    largestPlanet = currentPlanet;
                }
            }
        }
        return largestPlanet;
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

    public void addPlanet(String name, double radius, double mass){
        planets.add(new Planet(name, radius, mass));
    }

}
