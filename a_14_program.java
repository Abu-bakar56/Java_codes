import java.util.Scanner;

public class a_14_program {
    public static void main(String[] args) {
        int [] marks = new int [5];
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter marks of 5 student");
        for(int i=0;i< marks.length;i++){
            marks[i]=ac.nextInt();

        }
int sum =0;
        int n=5;
        float avg=0.0f;
        for(int i=0;i< marks.length;i++ ){
//            System.out.println(marks[i]);
             sum = sum + marks[i];



        }
        avg=sum/n;
        System.out.println(avg);

    }
}
