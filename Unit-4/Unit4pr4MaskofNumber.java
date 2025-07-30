import java.util.Scanner;

public class Unit4pr4MaskofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone;
        System.out.print("Enter the phone number: ");
        phone = sc.nextLine();
        String masked = "******" + phone.substring(6, 10);
        
        System.out.println("Masked number: "+masked);
    }
    
}
