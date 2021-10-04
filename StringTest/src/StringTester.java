public class StringTester {
    public static void main(String[] args){
        System.out.print("Lower reg to Upper reg: \n");
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(toUpperCase(i)+" ");
        }
        System.out.print("\nUpper reg to Lower reg: \n");
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(toLowerCase(i)+" ");
        }
    }
    static char toUpperCase(char ch){
        return (char) (ch&(~32));
    }
    static char toLowerCase(char ch){
        return (char) (ch|(32));
    }
}