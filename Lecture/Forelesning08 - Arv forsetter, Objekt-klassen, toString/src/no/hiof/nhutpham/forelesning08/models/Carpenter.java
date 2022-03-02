package no.hiof.nhutpham.forelesning08.models;

// En klasse, Snekker, som er satt til å arve fra Person-klassen ved bruk av kodeordet "extends".
// Dette vil si at Snekker-klassen også inneholder de variablene og metdoene som er definerte i
// Person. På en annen side er det bare de variablene og metodene som er satt til public
// som er direkte refererbare i Snekker.
public class Carpenter extends Person {

    // En variabel som er unik for Snekker
    private int totalHouseBuild;

    // En konstruktør som tar i mot parametere som er relevante for Person i tillegg til
    // de som er direkte relevante for Snekker. De som er relevante for Person blir sendt
    // til Person-konstruktøren ved bruk av super(). De som er direkte relevante for Snekker
    // benyttes til å direkte sette relevante variabler
    public Carpenter(String name, String lastName, int age, int totalHouseBuild) {
        super(name, lastName, age);

        this.totalHouseBuild = totalHouseBuild;
    }

    public int getTotalHouseBuild() {
        return totalHouseBuild;
    }

    public void setTotalHouseBuild(int totalHouseBuild) {
        this.totalHouseBuild = totalHouseBuild;
    }
}