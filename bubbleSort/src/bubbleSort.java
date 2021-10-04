public class bubbleSort{
    public static void main(String[] args){
        int[] array;
        array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = (int)(Math.pow(-1,i))*i*i%32+4;
            System.out.print(array[i]+" ");
        }
        System.out.print("\n-----------\n");
        bubble(array, 10);
        System.out.print("\n-----------\n");
        for (int i =0 ; i < 10; i++){
            System.out.print(array[i]+" ");
        }

    }
    static void bubble(int[] a, int length){
        for (int i = 1; i < length;i++){
            System.out.print("---------\nNew Iteration: "+i+"\n");
            for(int q = 0; q < length; q++) System.out.print(a[q]+" ");
            System.out.print('\n');
            for(int j = length-1; j >= i ; j--){
                System.out.print("Check: "+a[j]+" " + a[j-1]+'\n');
                if (a[j-1] > a[j]){
                    int t = a[j-1];
                    a[j-1] = a[j];
                    a[j] = t;
                    System.out.print("Change: "+ a[j]+" " + a[j-1]+'\n');
                }
            }
        }
    }

}
