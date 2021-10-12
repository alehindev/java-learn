public class StackHolder {
    public static void main(String[] args){
        Stack myStack = new Stack(11);
        for (int i = 0; i < 10; i++){
            System.out.print(myStack.push(i)+" ");
        }
        for (int i = 0; i < 10; i++){
            System.out.print(myStack.pop()+" ");
        }
    }

}
class Stack{
    private int[] stackMemory;
    private int length = 0;
    private int capacity = 0;
    private int errorVar = 0x404;
    Stack(){
        stackMemory = new int[10];
        capacity = 10;
        this.numberRand();
    }
    Stack(int n) {
        if( n > 0){
            stackMemory = new int[n];
            capacity = n;
        } else {
            stackMemory = new int[10];
            capacity = 10;
            numberRand();
        }
    }
    Stack(int[] array){
        length = 0;
        capacity = array.length;
        stackMemory = new int[capacity];
        for (int i = 0; i < array.length;i++){
            stackMemory[i] = array[i];
        }
    }
    private void numberRand(){
        for (int i = 0; i < capacity; i++){
            stackMemory[i] = ((i*3+4)/7)%10;
        }
    }
    public boolean push(int element){
        if(length < capacity){
            stackMemory[length++] = element;
            return true;
        }
        return false;
    }
    public int pop(){
        if (length > 0){
            return stackMemory[length--];
        } else {
            return errorVar;
        }
    }
    public int getCapacity(){
        return capacity;
    }
}