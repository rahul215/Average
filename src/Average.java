import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int num1,num2,num3,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        System.out.println("Enter third number");
        num3 = sc.nextInt();
        avg = (num1 + num2 + num3)/3;
        System.out.println(avg);
    }
}
