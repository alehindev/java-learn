package mypack2;

public class DemoPack2 {
    private String msg = "";
    public DemoPack2(){
        msg = "Nothing is here, number 2!";
    }
    public DemoPack2(String Msg){
        msg = Msg+", number 2!";
    }

    public String getMsg() {
        return msg;
    }
    public void print(){
        System.out.println(msg);
    }
}
