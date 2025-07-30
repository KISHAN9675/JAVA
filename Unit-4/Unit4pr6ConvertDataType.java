import java.util.Scanner;

public class Unit4pr6ConvertDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        float b;
        double c;
        System.out.print("Write a integer: ");
        a = sc.nextInt();

        System.out.print("Write a float: ");
        b = sc.nextFloat();

        System.out.print("Write a double: ");
        c = sc.nextDouble();

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);

        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
    }
}
