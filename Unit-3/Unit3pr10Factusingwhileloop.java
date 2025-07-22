import java.util.Scanner;
public class Unit3pr10Factusingwhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Fact = 1;
        int n;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        int temp = n;
        while (n >= 1) {
            Fact = Fact * n--;
        }
        System.out.println("Factorial of " +temp+ " is: " +Fact);
    }

}
