import interfaces.Printable;

public class Magazine implements Printable {

    private String publishing;
    private int score, numOfCustomers;

    public Magazine(String publishing, int score, int numOfCustomers) {
        this.publishing = publishing;
        this.score = score;
        this.numOfCustomers = numOfCustomers;
    }

    public static void printMagazines(Printable[] printables){
        for(Printable x: printables){
            if(x.getClass() == Magazine.class){
                x.print();
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "publishing='" + publishing + '\'' +
                ", score=" + score +
                ", numOfCustomers=" + numOfCustomers +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString()) ;
    }
}
