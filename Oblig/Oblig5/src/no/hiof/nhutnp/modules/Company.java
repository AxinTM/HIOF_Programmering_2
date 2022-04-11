package no.hiof.nhutnp.modules;

public abstract class Company {
    private String name;
    private String location;
    private String foundingYear;

    protected Company(String name, String location, String foundingYear) {
        this.name = name;
        this.location = location;
        this.foundingYear = foundingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(String foundingYear) {
        this.foundingYear = foundingYear;
    }
}
