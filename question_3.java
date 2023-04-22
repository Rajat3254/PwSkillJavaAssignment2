import java.util.Scanner;
public class question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first_Marks=sc.nextInt();
        int second_Marks=sc.nextInt();
        int third_Marks=sc.nextInt();
        int total_marks=(first_Marks+second_Marks+third_Marks);
        float percentage_marks=total_marks/3;
        System.out.println("Total Marks:"+total_marks);
        System.out.println("percentage marks:"+percentage_marks+"%");

    }
    
}
