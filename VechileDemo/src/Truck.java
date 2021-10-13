public class Truck extends Vehicle{
    private int maxWeight;
    Truck(){
        super();
        maxWeight = 0;
    }
    Truck(int len, int wid, int tnk, int avgM, int ld, int maxWt){
        super(len, wid, tnk, avgM, ld);
        maxWeight = maxWt;
    }

}
