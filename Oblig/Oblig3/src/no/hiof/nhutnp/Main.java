package no.hiof.nhutnp;

import no.hiof.nhutnp.models.*;


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

        System.out.println(solarSystem.toString());

        System.out.println();
        System.out.println(saturn.toString());

        System.out.println();
        System.out.println(sun.toString());

        System.out.println();
        saturn.printSurfaceGravity();

        System.out.println();
        System.out.println("The smallest planets on our Sol System is: " + solarSystem.getSmallestPlanet().getName());

        System.out.println();
        System.out.println("The largest planet Sol System is: "+ solarSystem.getLargestPlanet().getName());

        System.out.println();
        System.out.println(solarSystem.searchPlanetName("uranus"));


        System.out.println();
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(0) + "km to the Sun at 0 degrees");
        System.out.println();
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(90) + "km to the Sun at 90 degrees");
        System.out.println();
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(180) + "km to the Sun at 180 degrees");
        System.out.println();
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(270) + "km to the Sun at 270 degrees");
        System.out.println();
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(320) + "km to the Sun at 360 degrees");

        System.out.println();
        earth.printOrbitingVelocity(earth.distanceToCentralBody(0));
        System.out.println();
        earth.printOrbitingVelocity(earth.distanceToCentralBody(45));
        System.out.println();
        earth.printOrbitingVelocity(earth.distanceToCentralBody(90));
        System.out.println();
        earth.printOrbitingVelocity(earth.distanceToCentralBody(135));
        System.out.println();
        earth.printOrbitingVelocity(earth.distanceToCentralBody(180));


    }
}
