import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        int[] array = new int[100];
        int[] dopArr = new int[100];

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        for (int j = 0; j < n; j++){
            array[j] = sc.nextInt();
        }

        // 3 1 4 5 6
        int i = 0;
        dopArr[i] = 1;
        while(i < n) {
            i += array[i];

            if(i < n) {
                dopArr[i] = 1;
            }
        }
        if(dopArr[n-1]==0){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}