import java.util.Scanner;
public class Unit3pr6sumof5digit{
    public static void main(String []args){
        int n,i,sum =0,rem;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1; i<=5; i++){
            rem=n%10;
            n=n/10;
            sum=sum+rem;
        }
        System.out.println("sum:"+sum);
    }
    
}
