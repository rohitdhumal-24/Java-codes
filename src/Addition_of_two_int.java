import java.util.Scanner;

public class Addition_of_two_int {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        int b = sc.nextInt();

        int c = a +b;
        System.out.println("Addition of a and b is : "+c);
    }
}
