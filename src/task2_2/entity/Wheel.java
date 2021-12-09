package task2_2.entity;

public class Wheel {


    String brand;
    String type;
    int size;
    String view;

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", view='" + view + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public Wheel(String brand, String type, int size, String view ) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.view = view;
    }
}
