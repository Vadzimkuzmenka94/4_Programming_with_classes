package task2_3.entity;

public class District {
    String title;
    int population;

    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", population=" + population +
                '}';
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

    public District(String title, int population) {
        this.title = title;
        this.population = population;
    }
}
