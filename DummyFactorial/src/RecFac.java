import java.math.BigInteger;

public class RecFac {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static BigInteger factorial(int value) {
        if(value==0){
            return BigInteger.ONE;
        } else{
            return BigInteger.valueOf(value).multiply(factorial(--value));
        }

    }
}