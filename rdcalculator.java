//RD interest calculator for 5 years
import java.util.*;
public class rdcalculator {
    public static void main(String [] args) {
        System.out.println("Enter the amount monthly basis: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        double f = sc.nextInt();
        int y = (x * 12);
        double z = y * (f / 100);
        double a = y + z;
        int b = 36000 * 5;
        for (int i = 1; i < 5; i++)
        {
            a = ((a + y) * (f / 100)) + (a + y);
        }
        System.out.println("You will get amount after 5 years is : " + a);
    }
}
