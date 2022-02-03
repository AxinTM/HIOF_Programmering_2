package no.hiof.nhutpham;

import no.hiof.nhutpham.models.Planet;
import no.hiof.nhutpham.models.PlanetSystem;
import no.hiof.nhutpham.models.Star;


public class Main {
    public static void main(String[] args) {

        Star sun = new Star("Sun", 1.0,1.0, 5777);

        Planet earth = new Planet("Earth",0.08911486599899289,0.003146469968387777);
        Planet venus = new Planet("Venus",0.08465003077267387, 0.002564278187565859);
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        PlanetSystem solarSystem = new PlanetSystem("SolarSystem", sun, earth);
        solarSystem.addPlanet(venus);
        solarSystem.addPlanet(mercury);
        solarSystem.addPlanet(mars);
        solarSystem.addPlanet(jupiter);
        solarSystem.addPlanet(saturn);
        solarSystem.addPlanet(uranus);
        solarSystem.addPlanet(neptune);

        solarSystem.printStar();

        System.out.println();
        saturn.printPlanet();

        System.out.println();
        sun.printStar();

        System.out.println();
        saturn.printSurfaceGravity();

        System.out.println();
        System.out.println("The smallest planets on our Sol System is: " + solarSystem.getSmallestPlanet().getName());

        System.out.println();
        System.out.println("The largest planet Sol System is: "+ solarSystem.getLargestPlanet().getName());

    }
}
