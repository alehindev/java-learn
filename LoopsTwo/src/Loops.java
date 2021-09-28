import java.io.*;
import java.util.*;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++){
            int summ, b, n;
            summ = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            for (int j = 0; j < n; j++){
                summ += (1<<j)*b;
                System.out.print(summ+" ");
            }
            System.out.print('\n');
        }
    }
}