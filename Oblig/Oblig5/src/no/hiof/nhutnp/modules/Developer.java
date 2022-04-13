package no.hiof.nhutnp.modules;

import java.util.ArrayList;

public class Developer extends Company{

    private int totalDevelopedGame;
    private ArrayList<Game> developedGame = new ArrayList<>();

    public Developer(String name, String location, String foundingYear, int totalDevelopedGame, ArrayList<Game> developedGame) {
        super(name, location, foundingYear);
        this.totalDevelopedGame = totalDevelopedGame;
        this.developedGame = developedGame;
    }

    public int getTotalDevelopedGame() {
        return totalDevelopedGame;
    }

    public void setTotalDevelopedGame(int totalDevelopedGame) {
        this.totalDevelopedGame = totalDevelopedGame;
    }

    public ArrayList<Game> getDevelopedGame() {
        return developedGame;
    }

    public void setDevelopedGame(ArrayList<Game> developedGame) {
        this.developedGame = developedGame;
    }
}
