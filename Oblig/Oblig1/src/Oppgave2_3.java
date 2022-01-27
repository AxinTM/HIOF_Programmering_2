public class Oppgave2_3 {
    public static void main(String[] args){
        Planet mars = new Planet("Mars",3389.5F, 6.39E23);
        Planet jupiter = new Planet("Jupiter",71492F, 1.898E27);
        Planet venus = new Planet("Venus",6051, 4.867E24);

        mars.printInfo();
        jupiter.printInfo();
        venus.printInfo();
    }
}
