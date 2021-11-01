public class VehicleDemo {
    public static void main(String[] args){
        int[] pair;
        Truck myTruck = new Truck(300,200,40,80,4,900);
        System.out.println(myTruck.getTruckArea());
        System.out.println(myTruck.getMaxWeight());
        System.out.println(myTruck.getDistanceGap());
        pair = myTruck.superVar();
        System.out.println("myVar from Truck: "+pair[0]+" myVar from Vehicle: "+pair[1]);
        }
}