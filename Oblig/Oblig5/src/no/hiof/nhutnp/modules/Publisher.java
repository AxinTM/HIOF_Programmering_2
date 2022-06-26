package no.hiof.nhutnp.modules;

import java.util.ArrayList;

public class Publisher extends Company{

    private int totalPublishGame;
    private ArrayList<Game> publishedGame = new ArrayList<>();


    protected Publisher(String name, String location, String foundingYear) {
        super(name, location, foundingYear);
    }

    public int getTotalPublishGame() {
        return totalPublishGame;
    }

    public void setTotalPublishGame(int totalPublishGame) {
        this.totalPublishGame = totalPublishGame;
    }

    public ArrayList<Game> getPublishedGame() {
        return publishedGame;
    }

    public void setPublishedGame(ArrayList<Game> publishedGame) {
        this.publishedGame = publishedGame;
    }
}
