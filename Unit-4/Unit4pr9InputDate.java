import java.util.Scanner;
public class Unit4pr9InputDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date;
        int month;
        int year;

        System.out.print("Enter the Date: ");
        date = sc.nextInt();
        
        System.out.print("Enter the Month: ");
        month = sc.nextInt();

        System.out.print("Enter the Year: ");
        year = sc.nextInt();

        String s1 = String.valueOf(date);
        String s2 = String.valueOf(month);
        String s3 = String.valueOf(year);
        

        String joined = String.join("/",s1,s2,s3);
        System.out.println(joined);
    }
    
}
