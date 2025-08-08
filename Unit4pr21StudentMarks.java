import java.util.Scanner;

public class Unit4pr21StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[]marks = new float[5];
        float sum = 0;
        float avarage;
        System.out.print("Enter the Marks: ");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            sum = sum+marks[i];
        }
        avarage = sum/marks.length;
        System.out.println(avarage);

    }
}