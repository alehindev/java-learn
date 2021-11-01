import interfaces.Printable;

public class Main {
    public static void main(String[] args){

        Book book = new Book("Johny", 0,1,1);
        Magazine magazine = new Magazine("ACT", 0,1);
        Printable[] myPrintableArray = new Printable[10];

        for(int i = 0; i < 10; i++){
            myPrintableArray[i] = i%2==0 ? book : magazine;
        }


        for(Printable x : myPrintableArray){
            x.print();
        }

        Magazine.printMagazines(myPrintableArray);
        Book.printBooks(myPrintableArray);
    }
}
