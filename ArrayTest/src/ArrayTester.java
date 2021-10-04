public class ArrayTester {
    public static void main(String[] args){
        int matrixSize = 4, count  = 1;
        int[][] arrayTest = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++){
            for (int j = 0; j < matrixSize; j++){
                arrayTest[i][j] = count++;
            }
        }
        /*
        for (int i = 0; i < matrixSize; i++){
            for (int j = 0; j < matrixSize; j++){
                System.out.print(arrayTest[i][j]+" ");
            }
            System.out.println();
        }*/
        for (int[] i: arrayTest){
            for (int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        arrayTest[0] = new int[10];
        for (int i = 0 ; i < 10;i++){
            arrayTest[0][i] = 1;
        }
        for (int i = 0 ; i < 10; i++){
            System.out.print(arrayTest[0][i]+" ");

        }


    }
}