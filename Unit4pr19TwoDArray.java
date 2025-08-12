public class Unit4pr19TwoDArray {
    public static void main(String[] args) {
        int[][] arr1 = { { 6, 8, 9, 3 },
                { 4, 1, 10, 8 },
                { 13, 14, 19, 7 }
        };
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
