public class Unit4pr24TransposeMatrix {

    public static void main(String[] args) {
        int[][] arr1 = { { 4, 2, 5 }, { 5, 7, 3 } };
        int[][] arr2 = new int[arr1[0].length][arr1.length];
        int i, j;
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[0].length; j++) {
                arr2[j][i] = arr1[i][j];
            }
            
        }

        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr2[0].length; j++) {
                
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}