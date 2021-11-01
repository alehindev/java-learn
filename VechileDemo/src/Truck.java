public class Truck extends Vehicle{
    private int maxWeight;
    private int myVar = 222_222;
    Truck(){
        super();
        maxWeight = 0;
    }
    Truck(int len, int wid, int tnk, int avgM, int ld, int maxWt){
        super(len, wid, tnk, avgM, ld);
        maxWeight = maxWt;
    }
    double getTruckArea(){
        return getLength()*getWidth();
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    public int[] superVar(){
        int[] pair = new int[2];
        pair[0] = myVar;
        pair[1] = super.myVar;
        return pair;
    }
}
