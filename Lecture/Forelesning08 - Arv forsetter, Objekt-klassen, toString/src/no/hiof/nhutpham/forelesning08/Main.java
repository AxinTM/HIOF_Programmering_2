package no.hiof.nhutpham.forelesning08;

import no.hiof.nhutpham.forelesning08.models.BusDriver;
import no.hiof.nhutpham.forelesning08.models.CarpenterApprentice;
import no.hiof.nhutpham.forelesning08.models.Person;
import no.hiof.nhutpham.forelesning08.models.Carpenter;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jimmy", "Neutron", 12 );

        Carpenter carpenter = new Carpenter("Bjørn", "Magnusen", 47, 2);

        BusDriver bussDriver = new BusDriver
                ("Rolf", "Larsen", 38, "630, Fredrikstad - Halden");

        System.out.println(person.getName() + " " + person.getLastName() + " " + person.getAge());
        System.out.println(person.getName() + " " + person.getLastName() + " don't have any occupation.");

        System.out.println();
        System.out.println(carpenter.getName() + " " + carpenter.getLastName() + " " + carpenter.getAge());
        System.out.println("Total house Build: " + carpenter.getTotalHouseBuild());

        System.out.println();
        System.out.println(bussDriver.getName() + " " + bussDriver.getLastName() + " " + bussDriver.getAge());
        System.out.println("The bus driver drving route is: " + bussDriver.getRoute());

        System.out.println();

        System.out.println(person.getInfo());

        System.out.println();
        System.out.println(carpenter.getInfo());

        System.out.println();
        System.out.println(bussDriver.getInfo());

        CarpenterApprentice carpenterApprentice = new CarpenterApprentice
                ("Donald", "Duck", 86, 0, "70 year", 7640);

        System.out.println();
        System.out.println(carpenterApprentice.getInfo());
        System.out.println(carpenterApprentice.getName() + " " + carpenterApprentice.getLastName()
                + " have been an apprentice for " + carpenterApprentice.getApprenticeTime());
        System.out.println(carpenterApprentice.getName() + " " + carpenterApprentice.getLastName()
                + " have build a total of " + carpenterApprentice.getTotalHouseBuild()
                + " since he start out as carpenter apprentice.");
        System.out.println("He has an reputation as 'House Destroyer', the total number of house he has destroyed is: "
                + carpenterApprentice.getHouseDestroyed());

        System.out.println();
        System.out.println(person.toString());
    }
}
