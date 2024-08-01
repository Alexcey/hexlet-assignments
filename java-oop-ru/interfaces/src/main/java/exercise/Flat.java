package exercise;

// BEGIN
public class Flat implements Home {

    private double area;
    private double balconyArea;
    private int floor;

    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return this.area;
    }

    // public double getBalconyArea() {
    //     return this.balconyArea;
    // }

    // public double getFloor() {
    //     return this.floor;
    // }

    public String toString() {
        double sum = this.area + this.balconyArea;
        return "Квартира площадью " + sum  + " метров на "+ this.floor + " этаже";
    }

    @Override
    public int compareTo() {
        return 1;
    }
}
// END
