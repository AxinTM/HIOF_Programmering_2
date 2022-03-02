package no.hiof.nhutpham.forelesning08.models;

public class BusDriver extends Person {

    private String route;

    public BusDriver(String name, String lastName, int age, String route){
        super(name, lastName, age);

        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
