public class Merger {
    public static void main(String[] args){
        int[] firstArray, secondArray;
        firstArray = new int[10];
        secondArray = new int[10];
        for(int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i*2;
            secondArray[i] = i*3;
        }
        int[] mergedArray = mergeArrays(firstArray,secondArray);
        for (int el : mergedArray){
            System.out.print(el+" ");
        }
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length+ a2.length];
        int fPointer = 0, sPointer = 0;
        for (int i = 0; i < res.length; i++){
            if(fPointer < a1.length){
                if(sPointer < a2.length) {
                    if (a1[fPointer] <= a2[sPointer]){
                        res[i] = a1[fPointer++];
                    } else {
                        res[i] = a2[sPointer++];
                    }
                } else {
                    res[i] = a1[fPointer++];
                }
            } else {
                if(sPointer < a2.length) {
                    res[i] = a2[sPointer++];
                }
            }

        }
        return res;
    }
}