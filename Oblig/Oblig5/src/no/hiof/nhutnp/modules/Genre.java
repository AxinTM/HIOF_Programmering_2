package no.hiof.nhutnp.modules;

public class Genre {
    private String name;
    private int totalGenre;

    public Genre(String name, int totalGenre) {
        this.name = name;
        this.totalGenre = totalGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalGenre() {
        return totalGenre;
    }

    public void setTotalGenre(int totalGenre) {
        this.totalGenre = totalGenre;
    }
}
