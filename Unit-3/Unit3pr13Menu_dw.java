import java.util.Scanner;

public class Unit3pr13Menu_dw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select,num1,num2,sum,multiply;
        do{
            System.out.println("---Select any option---- ");
            System.out.println("1.Additon of two Number");
            System.out.println("2.Multiplication of two Number");
            System.out.println("3.Exit");
            System.out.print("======> ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Enter the first Number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter the Secound Number: ");
                    num2 = sc.nextInt();
                    sum = num1 + num2;
                    System.out.println("Sum of " + num1 +" and " + num2 + " is : " + sum);
                    break;
                    case 2:
                    System.out.print("Enter the first Number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter the Secound Number: ");
                    num2 = sc.nextInt();
                    multiply = num1 + num2;
                    System.out.println("Multliplication of " + num1 +" and " + num2 + " is : " + multiply);
                    break;
                case 3:
                    System.out.println("Exiting Program");
                    System.exit(0);
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
        while(true);    
    }


}
