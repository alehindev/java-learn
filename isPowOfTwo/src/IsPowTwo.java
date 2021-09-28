public class IsPowTwo{
    public static void main(String[] args){
        System.out.print(isPowerOfTwo(5));
    }
    public static boolean isPowerOfTwo(int value){
        return value!=0 &((Math.abs(value) & (Math.abs(value)-1)) == 0);
    }
}