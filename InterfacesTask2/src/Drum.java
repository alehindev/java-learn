import interfaces.musInstrument;

public class Drum implements musInstrument{
    private String KEY = "Drum key";
    private int size;

    public Drum(String KEY, int size) {
        this.KEY = KEY;
        this.size = size;
    }

    @Override
    public void play(){
        System.out.println("Играет Drum, с такими-то характеристиками: \nразмер: \n"+size+"\nKEY: "+KEY);
    }


}
