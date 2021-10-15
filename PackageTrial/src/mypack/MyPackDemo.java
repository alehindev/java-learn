package mypack;

public class MyPackDemo {
    private String msg = "";
    MyPackDemo(){
        msg = "Nothing here!";
    }
    MyPackDemo(String Msg){
        msg = Msg;
    }
    public void print(){
        System.out.println(msg);
    }

    public String getMsg() {
        return msg;
    }
}
