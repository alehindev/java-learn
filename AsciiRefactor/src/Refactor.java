public class Refactor {
    public static void main(String[] args) throws java.io.IOException{
        char a = (char)System.in.read();
        while (a != '.'){
            if (a >='A' && a <='Z'){
                a  = (char)(a+32);
            } else if(a >='a' && a <='z') {
                a  = (char)(a-32);
            }
            System.out.println(a);
            while(System.in.read()!='\n');
            a = (char)System.in.read();
        }

    }
}
