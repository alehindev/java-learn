package Queue;

public class CharQueue implements IQueue {
    private final char[] array;
    private int putIndex, getIndex;

    public CharQueue(){
        array = new char[100];
        putIndex = getIndex = 0;
    }
    public CharQueue(int size){
        array = new char[size];
        putIndex = getIndex = 0;
    }
    public CharQueue(CharQueue obj){
        array = obj.array.clone();
        putIndex = obj.putIndex;
        getIndex = obj.getIndex;
    }

    public char get(){
        if(array.length > getIndex && getIndex != putIndex){
            return array[getIndex];
        }
        return '-';
    }
    public void push(char ch){
        if (array.length > putIndex){
           array[putIndex++] = ch;
        }
    }
    public char pop(){
        if(getIndex != putIndex) {
            return array[getIndex++];
        }
        return '-';
    }

    public char[] getArray() {
        return array;
    }
}
