package no.hiof.nhutnp.modules;

import java.util.ArrayList;

public class Game {
    private String name;
    private String platform;
    private Developer developer;
    private Publisher publisher;
    private ArrayList<Genre> genre;

    public Game(String name, String platform, Developer developer, Publisher publisher, ArrayList<Genre> genre) {
        this.name = name;
        this.platform = platform;
        this.developer = developer;
        this.publisher = publisher;
        this.genre = genre;
    }

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public ArrayList<Genre> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<Genre> genre) {
        this.genre = genre;
    }
}
