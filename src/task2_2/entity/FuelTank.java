package task2_2.entity;

public class FuelTank {
    int volume;
    int currentFullnes;

    @Override
    public String  toString() {
        return "FuelTank{" +
                "volume=" + volume +
                ", currentFullnes=" + currentFullnes +
                '}';
    }

    public FuelTank(int volume, int currentFullnes) {
        this.volume = volume;
        this.currentFullnes = currentFullnes;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentFullnes() {
        return currentFullnes;
    }

    public void setCurrentFullnes(int currentFullnes) {
        this.currentFullnes = currentFullnes;
    }
}
