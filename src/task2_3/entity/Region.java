package task2_3.entity;

public class Region {
    String title;
    int square;
    int population;

    @Override
    public String toString() {
        return "Region{" +
                "title='" + title + '\'' +
                ", square=" + square +
                ", population=" + population +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Region(String title, int square, int population) {
        this.title = title;
        this.square = square;
        this.population = population;
    }
}
