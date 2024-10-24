package city;

public class Country {
    private String name;
    private long livers;
    private String language;
    private int area;

    public Country(String name, long livers, String language, int area) {
        this.name = name;
        this.livers = livers;
        this.language = language;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLivers() {
        return livers;
    }

    public void setLivers(long livers) {
        this.livers = livers;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return
                "\nName: " + name +
                "\nLivers: " + livers +
                "\nLanguage: " + language +
                "\nArea: " + area ;
    }
}
