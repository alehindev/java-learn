public class CharExpression {
    public static void main(String[] args){
        int a = 32;
        System.out.print(charExpression(a));
    }
    public static char charExpression(int a) {
        return (char)('\\'+a);
    }
}