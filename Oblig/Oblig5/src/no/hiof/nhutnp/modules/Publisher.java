package no.hiof.nhutnp.modules;

import java.util.ArrayList;

public class Publisher extends Company{

    private int total_publish_game;
    private ArrayList<Game> publishedGame = new ArrayList<>();


    protected Publisher(String name, String location, String foundingYear) {
        super(name, location, foundingYear);
    }

    public int getTotal_publish_game() {
        return total_publish_game;
    }

    public void setTotal_publish_game(int total_publish_game) {
        this.total_publish_game = total_publish_game;
    }

    public ArrayList<Game> getPublishedGame() {
        return publishedGame;
    }

    public void setPublishedGame(ArrayList<Game> publishedGame) {
        this.publishedGame = publishedGame;
    }
}
