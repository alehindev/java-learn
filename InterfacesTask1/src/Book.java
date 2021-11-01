import interfaces.Printable;

public class Book implements Printable {

    private String author;
    private int score, numPublications, numPages;


    Book(String author, int score, int numPublications, int numPages){
        this.author = author;
        this.score = score;
        this.numPages = numPages;
        this.numPublications = numPublications;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", score=" + score +
                ", numPublications=" + numPublications +
                ", numPages=" + numPages +
                '}';
    }
    public static void printBooks(Printable[] printables){
        for(Printable x: printables){
            if(x instanceof Book){
                x.print();
            }
        }
    }

    public void print(){
        System.out.println(this.toString());
    }

}
