import java.util.Scanner;

public class a_13_program {
    public static void main(String[] args) {
        int [] marks = {18,55,996,12,33};
        int n;
        System.out.println("Enter number you want to search");
        Scanner ac = new Scanner(System.in);
        n=ac.nextInt();
        int i;
        for( i=0;i<marks.length;i++){
            if(marks[i]==n){
                System.out.println("this is present ");
            break;
            }
            }
        if( marks.length==i){
        System.out.println("not found");
        }
        }
    }
