import java.util.Scanner;
public class Unit4pr19Array {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[4]);


        //using itration for loop:-
        System.out.println("Result of for loop");
        int [] arr2 = {1,2,3,4,5};
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        //using scanner:-
        Scanner sc = new Scanner(System.in);
        int [] arr3 = new int[5];
        for(int i=0; i<arr3.length; i++){
        System.out.print("Enter the number: "+(i+1)+"digit:");          
            arr3[i] = sc.nextInt();
        }
        for(int i=0; i<arr3.length; i++){
            System.out.println("No"+(i+1)+"="+arr3[i]);
        }

        //using string:-
        Scanner scr = new Scanner(System.in);
        String [] arr4 = new String[5];
        for(int i=0; i<arr4.length; i++){
        System.out.print("Enter the Name: ");          
            arr4[i] = scr.nextLine();
        }
        for(int i=0; i<arr4.length; i++){
            System.out.println("No"+(i+1)+"="+arr4[i]);
        }
    }
}
