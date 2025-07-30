import java.util.Scanner;

public class Unit4pr3StringEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;
        
        System.out.print("Enter any String1: ");
        s1 = sc.nextLine(); 
        System.out.print("Enter any String2: ");
        s2 = sc.nextLine();
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();


        if(s1.length()!=s2.length()){
            System.out.println("String are not equal");
            return;
        }
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("String are not equal");
                return;
            }
        }
        System.out.println("String are equal");
    }
    
}
