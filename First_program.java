import java.util.Scanner;

public class First_program{
    public static void main(String[] args) {
        System.out.println("Khown wo add there number");
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        a=sc.nextInt();
        System.out.println("enter number 2");
        b=sc.nextInt();

        int sum=a+b;

        System.out.println(sum);

    }
        }