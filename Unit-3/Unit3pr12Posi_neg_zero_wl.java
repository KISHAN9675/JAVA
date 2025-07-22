import java.util.Scanner;

public class Unit3pr12Posi_neg_zero_wl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posi = 0;
        int negi = 0;
        int zero = 0;
        int num = 0;
        char ch;
        while (true) {
            System.out.print("Enter the number: ");
            num = sc.nextInt();

            if (num > 0)
                posi++;
            if (num < 0)
                negi++;
            if (num == 0)
                zero++;
            System.out.println("Enter more 't'? ");
            System.out.println("if you want answer 'f' ");
            ch = sc.next().charAt(0);
            if (ch == 'F' || ch == 'f')
                break;
            else if (ch == 'T' || ch == 't') {
                System.out.println("OK");
            } else {
                System.out.print("Enter t/f ");
            }
        }
        System.out.println("Total positive Number :"+ posi);
        System.out.println("Total negitive Number :"+ negi);
        System.out.println("Total zero Number :"+ zero);
    }
}
