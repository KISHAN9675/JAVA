import java.util.Scanner;

public class Unit3pr14Printbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem;
        int binary = 0;
        System.out.print("Enetr the number: ");
        int a = sc.nextInt();

        while (a > 0) {
            rem = a % 2;
            binary = binary * 10 + rem;
            a = a / 2;
        }

        int rev = 0;
        while (binary > 0) {
            rev = rev * 10 + (binary % 10);
            binary = binary / 10;
        }
        System.out.print(" Binary number is: " + rev);

    }
}