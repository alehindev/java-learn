import java.util.Scanner;

public class Convertor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++){
            byte value = sc.nextByte();
            System.out.print(byteToBitString(value));
        }

    }
    public static String byteToBitString(byte value){
        return Integer.toBinaryString(value);
    }
}