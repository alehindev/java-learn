public class FlipBit {
    public static void main(String[] args){
        int a = flipBit(13,1);
        System.out.print(a);
    }
    public static int flipBit(int value, int index){
        return (1<<index-1)^value;
    }
}