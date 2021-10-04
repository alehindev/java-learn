public class QueueClass {
    public static void main(String[] args){
        Queue queue = new Queue(10);
        for (int i = 1 ; i < 6; i++){
            queue.putTail(i);
        }
        queue.print();
        queue.getHead();
        queue.print();
        queue.putTail(142);
        queue.print();
    }
}
class Queue {
    int[] queue;
    int putInd, getInd, count;

    Queue(){
        queue = null;
        putInd = getInd = 0;
        count = 0;
    }

    Queue(int size){
        queue = new int[Math.abs(size)];
        putInd = getInd = 0;
        count = 0;
    }
    void putTail(int a){
        count++;
        if(count > queue.length){
            getInd++;
        }
        queue[putInd++] = a;
        putInd %= queue.length;
    }
    int getHead(){
        int res = queue[getInd++];
        getInd%=queue.length;
        count--;
        return res;
    }
    void print(){
        int itGet = getInd;
        for (int i = 0; i < count; i++){
            System.out.print(queue[itGet++]+" ");
            itGet %= queue.length;
        }
        System.out.println();
    }

}