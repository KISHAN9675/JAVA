import java.util.Scanner;

public class Unit4pr5Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        String city;
        
        System.out.print("Enter the user name: ");
        user = sc.nextLine();

        System.out.print("Enter the city name: ");
        city = sc.nextLine();
        
        System.out.println("String result: " +user +" " +city);

    }
    
}
