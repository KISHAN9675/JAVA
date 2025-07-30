import java.util.Scanner;

public class Unit4pr8ReplacingMethod {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str1 ;
        System.out.println("Enter String: "); 
        str1 = sc.nextLine();

        String str2 = str1.replace("a","l");
        System.out.println(str2);
    }
    
}
