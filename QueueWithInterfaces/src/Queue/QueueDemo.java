package Queue;

public class QueueDemo {
    public static void main(String[] args){
        CharQueue myQueue = new CharQueue(10);
        SuperCharQueue mySuperDuperQueue = new SuperCharQueue(100);

        for (int i = 0; i < 2000; i++) {
            myQueue.push((char)(i+'a'));
        }
        for (int i = 0; i < 11; i++){
            System.out.print(myQueue.pop()+" ");
        }
        mySuperDuperQueue.print();  
    }
}
