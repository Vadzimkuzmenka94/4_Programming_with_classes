package task2_3.entity;

public class City {
    String title;
    int population;
    boolean capital;
    boolean regionCentre;



    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                ", population=" + population +
                ", capital=" + capital +
                ", regionCentre=" + regionCentre +
                '}';
    }

    public City(String title, int population, boolean capital, boolean regionCentre) {
        this.title = title;
        this.population = population;
        this.capital = capital;
        this.regionCentre = regionCentre;
    }

    public boolean isRegionCentre() {
        return regionCentre;
    }

    public void setRegionCentre(boolean regionCentre) {
        this.regionCentre = regionCentre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public City(String title, int population, boolean capital) {
        this.title = title;
        this.population = population;
        this.capital = capital;
    }
}
