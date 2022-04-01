package no.hiof.nhutnp;

import no.hiof.nhutnp.models.*;
import no.hiof.nhutnp.tools.StarCSVFileHandler;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Star sun = new Star("Sun", 1.0,1.0, 5777);

        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777,
                1, 0.017, 365, sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859,
                0.723, 0.007, 225, sun);
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4,
                0.387, 0.206, 88, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4,
                1.524, 0.093, 687, sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440,
                0.049, 4380, sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275,
                9.5826, 0.057, 10585, sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773,
                19.2184, 0.046, 30660, sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066,
                30.11, 0.010, 60225, sun);

        PlanetSystem solarSystem = new PlanetSystem("SolarSystem", sun, earth);
        solarSystem.addPlanet(venus);
        solarSystem.addPlanet(mercury);
        solarSystem.addPlanet(mars);
        solarSystem.addPlanet(jupiter);
        solarSystem.addPlanet(saturn);
        solarSystem.addPlanet(uranus);
        solarSystem.addPlanet(neptune);

        PlanetSystem solarSystem2 = new PlanetSystem("SolarSystem2", sun, earth);
        solarSystem2.addPlanet(venus);
        solarSystem2.addPlanet(mercury);
        solarSystem2.addPlanet(mars);

        ArrayList<Planet> planet = new ArrayList<>(solarSystem.getPlanets());
        ArrayList<PlanetSystem> planetSystems = new ArrayList<>();

        planetSystems.add(solarSystem);
        planetSystems.add(solarSystem2);

        for (Planet p : planet) {
        System.out.println(p);
        }
        System.out.println();
        Collections.sort(planet);

        for (Planet p : planet) {
            System.out.println(p);
        }

        for (PlanetSystem ps : planetSystems) {
            System.out.println(ps);
        }
        System.out.println();
        Collections.sort(planetSystems);

        for (PlanetSystem ps : planetSystems) {
            System.out.println(ps);
        }
        Star mu_cas = new Star("MU Cas", 4.192, 4.657, 14750);
        Star v69_47 = new Star("V69-47", 1.316, 0.876, 5945);
        Star yz_cas = new Star("YZ Cas", 2.547, 2.308, 9200);
        Star ngc188 = new Star("NGC188", 1.425, 1.102, 5900);
        Star zet_phe = new Star("zet Phe", 2.853, 3.922, 14550);

        ArrayList<Star> moreStar = new ArrayList<>();

        moreStar.add(sun);
        moreStar.add(mu_cas);
        moreStar.add(v69_47);
        moreStar.add(yz_cas);
        moreStar.add(ngc188);
        moreStar.add(zet_phe);

        StarCSVFileHandler starCSVFileHandler = new StarCSVFileHandler();

        starCSVFileHandler.writeObjectsToFile(moreStar, "Stars");

        ArrayList<Star> listFromFile = starCSVFileHandler.readObjectFromFile("Stars");
            for (Star s : listFromFile){
                System.out.println(s);
            }
    }

}
