package mypack;

import mypack2.*;

public class DemoPack {
    public static void main(String[] args){
        MyPackDemo a = new MyPackDemo("There is a message!");
        MyPackDemo b = new MyPackDemo();
        a.print();
        b.print();
        DemoPack2 a1 = new DemoPack2("There is a message");
        DemoPack2 b1 = new DemoPack2();
        a1.print();
        b1.print();
    }
 }
