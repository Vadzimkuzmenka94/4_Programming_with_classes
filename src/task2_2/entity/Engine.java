package task2_2.entity;

public class Engine {
    Double volume;
    String type;
    int power;

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", type='" + type + '\'' +
                ", power=" + power +
                '}';
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine(Double volume, String type, int power) {
        this.volume = volume;
        this.type = type;
        this.power = power;
    }
}
