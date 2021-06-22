package web.model;

public class Car {
    private int id;
    private String model;
    private String color;
    private int serial;
    private static int CARS_COUNT = 0;

    public Car(String model, String color, int serial) {
        this.id = ++CARS_COUNT;
        this.model = model;
        this.color = color;
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car id:" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serial=" + serial;
    }
}
