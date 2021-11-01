public class Vehicle {
    private double length, width, tank, avgMph, load;
    protected int myVar = 111_111;
    Vehicle(){
        length = width = tank = avgMph = load = 0;
    }
    Vehicle(int len, int wid, int tnk, int avgM, int ld){
        length = len;
        width = wid;
        tank = tnk;
        avgMph = avgM;
        load = ld;
    }

    public void setAvgMph(double avgMph) {
        this.avgMph = avgMph;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getAvgMph() {
        return avgMph;
    }

    public double getLength() {
        return length;
    }

    public double getTank() {
        return tank;
    }

    public double getWidth() {
        return width;
    }
    void print(){
        System.out.print("Hi it's me Vehicle!\n");
    }
    double getDistanceGap(){
        return avgMph * load;
    }
}