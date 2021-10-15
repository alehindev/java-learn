import java.util.Scanner;

public class Reverser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] n = {1,2,3};
        String str = sc.next();

        System.out.println(anySum(n));
        System.out.println(reverse(str));

    }
    static String reverse(String str){
        return (str.length()==1 ? str : str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1)));
    }
    static int anySum(int ... v){
        int sum = 0;
        for (int i : v){
            sum+=i;
        }
        return sum;
    }
}
