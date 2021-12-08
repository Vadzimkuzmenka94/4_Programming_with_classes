package task1_10;

public class Airline {
    int number;
    String type;
   Double time;
    String day;
    String destination;

    @Override
    public String toString() {
        return "Airline{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", day='" + day + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Airline(int number, String type, Double time, String day, String destination) {
        this.number = number;
        this.type = type;
        this.time = time;
        this.day = day;
        this.destination = destination;
    }
}
