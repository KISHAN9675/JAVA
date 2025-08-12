public class Unit4pr22MinMax {
    public static void main(String[] args) {
        int[]arr1 = {10,30,50,44,65};
        int max = arr1[0];
        int min = arr1[0];
        for(int i=0; i<5; i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
            if(arr1[i]<min){
                min = arr1[i];
            }
        }
        System.out.println("max= " +max);
        System.out.println("min= " +min);
    }
    
}
