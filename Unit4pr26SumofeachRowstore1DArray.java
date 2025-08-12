public class Unit4pr26SumofeachRowstore1DArray {
    public static void main(String[] args) {
        int[][] arr1 = { { 7, 2, 3 }, { 1, 4, 6 } };
        int[] arr2 = { 0, 0 };
        int i, j;
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[0].length; j++) {
                arr2[i] = arr2[i] + arr1[i][j];
            }
        }
        for (i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

}
