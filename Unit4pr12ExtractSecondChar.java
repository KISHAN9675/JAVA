//WAP to extract and print every second character from string using chatAt() ?
import java.util.Scanner;

public class Unit4pr12ExtractSecondChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enetr the any String: ");
        str = sc.nextLine();
        for(int i=0; i<=str.length(); i=i+2){
           char ch = str.charAt(i);
           System.out.print(ch);
        }
    }
}