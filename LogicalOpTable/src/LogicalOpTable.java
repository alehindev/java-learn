public class LogicalOpTable{
    public static void main(String[] args){
        boolean op1 = false, op2 = false;
        System.out.print("op1\top2\txor\tor\tand\tnot\n");
        System.out.print((op1 ? 1 : 0)+"\t"+(op2 ? 1 : 0)+"\t"+(op1^op2 ? 1 : 0)+"\t"+(op1||op2 ? 1 : 0)+"\t"+(op1&&op2 ? 1 : 0)+"\t"+(!op1 ? 1 : 0)+"\n");
        op1 = false;
        op2 = true;
        System.out.print("op1\top2\txor\tor\tand\tnot\n");
        System.out.print((op1 ? 1 : 0)+"\t"+(op2 ? 1 : 0)+"\t"+(op1^op2 ? 1 : 0)+"\t"+(op1||op2 ? 1 : 0)+"\t"+(op1&&op2 ? 1 : 0)+"\t"+(!op1 ? 1 : 0)+"\n");
        op1 = true;
        op2 = false;
        System.out.print("op1\top2\txor\tor\tand\tnot\n");
        System.out.print((op1 ? 1 : 0)+"\t"+(op2 ? 1 : 0)+"\t"+(op1^op2 ? 1 : 0)+"\t"+(op1||op2 ? 1 : 0)+"\t"+(op1&&op2 ? 1 : 0)+"\t"+(!op1 ? 1 : 0)+"\n");
        op1 = true;
        op2 = true;
        System.out.print("op1\top2\txor\tor\tand\tnot\n");
        System.out.print((op1 ? 1 : 0)+"\t"+(op2 ? 1 : 0)+"\t"+(op1^op2 ? 1 : 0)+"\t"+(op1||op2 ? 1 : 0)+"\t"+(op1&&op2 ? 1 : 0)+"\t"+(!op1 ? 1 : 0)+"\n");
    }
}