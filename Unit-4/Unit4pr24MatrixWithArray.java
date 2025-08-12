public class Unit4pr24MatrixWithArray {
    public static void main(String[] args) {
        int[][]arr1 = {{2,4},{6,3}};
        int[][]arr2 = {{5,3},{9,6}};
        int[][]sum = new int[2][2];
        int i,j;
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                sum[i][j] = arr1[i][j]+arr2[i][j]; 
            }
        }
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
