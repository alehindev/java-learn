import java.util.Scanner;

public class Solution {
        public static void main(String[] args){
            int b , h;
            Scanner sc = new Scanner(System.in);
            b = sc.nextInt();
            h = sc.nextInt();
            try {
                if (b > 0 & h > 0) {
                    System.out.println(b*h);
                } else {
                    throw new Exception("Breadth and height must be positive");
                }
            } catch (Exception e){
                System.out.println(e.toString());
            }
        }
}