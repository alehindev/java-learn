public class InchToMeters {
    public static void main(String[] args){
        double meter;
        for (int it = 1; it <= 100; it++){
            meter = it/39.37;

            System.out.println("inch: "+it+", meters: "+meter);
            if(it%12==0){
                System.out.print('\n');
            }
        }
    }
}