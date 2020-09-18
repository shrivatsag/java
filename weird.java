import java.util.Scanner;
public class weird {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n \n");
        int n;
        n = scan.nextInt();
        if (n%2!= 0) {
            System.out.println("Weird");
        }
        if (n % 2 == 0 && n >= 6 && n <= 20)
        {
            System.out.println("Weird");
        }
        if (n % 2 == 0 && n >= 6 && n <= 20)
        {
            System.out.println("Weird");
        }
        if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }
    }
}