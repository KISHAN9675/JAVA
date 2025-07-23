import java.util.Scanner;

public class Unit3pr4 {
    public static final int case1 = 0;

    public static void main(String []args){
        Scanner sc = new Scanner
        (System.in);
        int choose, num1,num2,sum,multiply, i;
        for(i = 1; i<10; i++ ){
            System.out.println("..Menu..");
            System.out.println("1.Even or Odd");
            System.out.println("2.Addition of two number");
            System.out.println("3.Multipliction");
            System.out.println("4.Exit");
            System.out.print("Enter 1 to 4 number");
            choose = sc.nextInt();
            switch(choose){
                case1:
                    System.out.println("Enter the number");
                    num1 = sc.nextInt();
                    if(num1 %2 == 0){
                        System.out.println(num1+"is even number");
                    }else{
                        System.out.println(num1+"is odd number");
                    }
                    break;
                case2:
                    System.out.println("Enter the first Number");
                    num1 = sc.nextInt();
                    System.out.println("enter the second number");
                    num2 = sc.nextInt();
            }
        }
    }
}
