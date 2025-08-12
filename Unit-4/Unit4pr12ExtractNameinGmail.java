//WAP to extract domain name from an email address using substring()?
import java.util.Scanner;

public class Unit4pr12ExtractNameinGmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter any Email: ");
        str = sc.nextLine();
        int x = str.indexOf('@');
        str = str.substring(x+1);
        System.out.println(str);

    }
    
}
