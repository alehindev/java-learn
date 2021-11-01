import interfaces.*;

public class Main {
    public static void main(String[] args){

        musInstrument[] array = new musInstrument[10];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                Drum drum = new Drum("Drum en Base", ((i+11)*2)%10);
                array[i] = drum;
            } else {
                Guitar guitar = new Guitar("Guitar en Base", (i * 2 + 1) % 10);
                array[i] = guitar;
            }
        }

        for(musInstrument inst : array){
            inst.play();
        }


    }
}
