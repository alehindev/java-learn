public class BitShift {
    public static void main(String[] args){
        int num = 3;
        for (int i = 1; i < 30;i++){
            System.out.println(bitShiftUp(num, i));
        }

    }
    static int bitShiftUp(int number, int grade){
        return number<<grade;
    }

}