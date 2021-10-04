public class CmdTester {
    public static void main(String[] args){
        for (String arg: args) {
            switch (arg){
                case "connect":
                    System.out.println("connected");
                    break;
                case "break":
                    System.out.println("connection broke");

            }
        }

    }
}
