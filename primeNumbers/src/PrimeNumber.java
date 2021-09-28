public class PrimeNumber{
    public static void main(String[] args){
        System.out.print("Prime numbers:\n");
        for (int i = 2; i <= 100; i++){
            int count = 0;
            for (int j = 2; j < (int)(Math.sqrt(i))+1; j++){
                if( (i != j) & (i % j == 0)){
                    count++;
                }
            }
            if (count == 0){
                System.out.print(i+" ");
            }
        }
    }
}