import interfaces.musInstrument;

public class Guitar implements musInstrument{
    private String KEY = "до мажор";
    private int amountOfStrings;

    public Guitar(String KEY, int amountOfStrings) {
        this.KEY = KEY;
        this.amountOfStrings = amountOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "KEY='" + KEY + '\'' +
                ", amountOfStrings=" + amountOfStrings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет Guitar-a, с такими-то характеристиками: \nколичество струн: \n"+amountOfStrings+"\nKEY: "+KEY);
    }
}
