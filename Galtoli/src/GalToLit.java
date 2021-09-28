public class GalToLit {
    public static void main(String[] args){
        double liters;
        for (int counter = 1; counter <= 100; counter++){
            liters = counter * 3.7854;
            System.out.println(liters);

            if (counter % 10 == 0){
                System.out.println('\n');
            }
        }
    }

}