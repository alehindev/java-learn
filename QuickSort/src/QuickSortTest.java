public class QuickSortTest {
    public static void main(String[] args){
        int[] array = {4,1,2,0,4,5,6,41,8,-9};
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        QuickSort.qSort(array);
        for(int x: array){
            System.out.print(x+" ");
        }
        return;
    }
}
class QuickSort{
    static void qSort(int[] array){
        qSortRec(array, 0, array.length-1);
    }
    static void qSortRec(int[] array, int left, int right){
        if(array.length != 0){
            int l = left, r = right, cmrnd = array[(left+right)/2];

            do {
               while((l < right) && (array[l] < cmrnd)){
                   l++;
               }
               while((r > left) && (array[r] > cmrnd)){
                   r--;
               }
               if(l <= r){
                   int temp = array[l];
                   array[l] = array[r];
                   array[r] = temp;
                   l++;
                   r--;
               }
            } while(l <= r);
            if(left < r) qSortRec(array,left,r);
            if(right > l) qSortRec(array,l,right);
        }
    }
}