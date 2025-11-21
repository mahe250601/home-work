import java.util.Scanner;
{
public class FindMaximum 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int max = a;  

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("The maximum number is: " + max);

        sc.close();
    }
}




















}