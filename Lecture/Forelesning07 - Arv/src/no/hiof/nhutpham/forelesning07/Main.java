package no.hiof.nhutpham.forelesning07;

import no.hiof.nhutpham.forelesning07.models.Carpenter;
import no.hiof.nhutpham.forelesning07.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nhut", "Pham", 35);
        System.out.println(person.getName() + " " + person.getLastName());


        System.out.println();

        Carpenter carpenter = new Carpenter("Son", "Pham", 29, 10);
        System.out.println(carpenter.getName() + " " + carpenter.getLastName());

        System.out.println();
        System.out.println(carpenter.getTotalHouseBuild());

        System.out.println();

        carpenter.setName("Tesla");
        carpenter.setLastName("Le");
        carpenter.setTotalHouseBuild(2);
        System.out.println(carpenter.getName() + " " + carpenter.getLastName() + "\n" + carpenter.getTotalHouseBuild());

    }
}
