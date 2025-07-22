import java.util.Scanner;

public class Unit3pr11Additionofdigit_wl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        char ch;
        boolean istrue = true;
        while (istrue) {
            System.out.print("Enter the digit: ");
            num = sc.nextInt();
            sum = sum + num;
            System.out.print("Do want enter the more number (T/F): ");
            ch = sc.next().charAt(0);
            if (ch == 'f' || ch == 'F') {
                istrue = false;

            } else if (ch == 't' || ch == 'T') {
                System.out.println("OK");
            } else {
                System.out.println("Please answer in 'T' or 'F': ");
            }
        }
        System.out.println("sum = " + sum);
    }
}
