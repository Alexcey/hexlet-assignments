package exercise;

// BEGIN
public class Cottage implements Home{
    private final double area;
    private final int floorCount;

    Cottage(double area, int floorCount){
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public String toString() {
        return this.floorCount + " этажный коттедж площадью "+ this.area + " метров";
    }

    @Override
    public int compareTo() {
        return 1;
    }
}
// END
