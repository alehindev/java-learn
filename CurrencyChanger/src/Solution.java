import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setCurrency(Currency.getInstance(Locale.US));
        System.out.println("US: "+nf.getCurrencyInstance(Locale.US).format(n));
        nf.setCurrency(Currency.getInstance(Locale.US));
        System.out.println("India: Rs."+nf.format(n).substring(0,nf.format(n).length()-1));
        nf.setCurrency(Currency.getInstance(Locale.CHINA));
        System.out.println("China: "+nf.getCurrencyInstance(Locale.CHINA).toString().toUpperCase(Locale.ROOT)+nf.format(n));
        nf.setCurrency(Currency.getInstance(Locale.FRANCE));
        System.out.println("France: "+nf.getCurrencyInstance(Locale.FRANCE).format(n));

    }
}