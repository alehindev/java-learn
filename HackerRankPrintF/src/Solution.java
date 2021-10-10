import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        try {
            int s = Integer.valueOf(a).intValue();
            System.out.println("Good job");

        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }

}