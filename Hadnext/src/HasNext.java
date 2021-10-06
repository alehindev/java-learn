import java.util.Scanner;

public class HasNext {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        do {
            String s = sc.nextLine();
            System.out.println(count++ + " " + s);
        } while(sc.hasNext());
    }
}