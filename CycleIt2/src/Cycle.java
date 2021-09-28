public class Cycle {
    public static void main(String[] args){
        for (int i = 0; i <= 1_000_000_000; i+=2){
            if(i%50==0) System.out.print('\n');
            System.out.print( Integer.toString(i)+' ');
        }
    }
}

