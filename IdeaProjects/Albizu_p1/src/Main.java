import java.security.SecureRandom;
import java.util.Scanner;

public class Main
{
    public static void mult()
    {
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        SecureRandom sr = new SecureRandom();
        Scanner in = new Scanner(System.in);
        num1 = sr.nextInt(10);
        num2 = sr.nextInt(10);

        System.out.println("How much is " + num1 + " times " + num2 + " ? ");
        answer = in.nextInt();

        if (answer == (num1*num2))
        {
            System.out.println("Very good!");
            mult();
        }
        else
        {
            while (answer != (num1*num2))
            {
                System.out.println("No. Please try again.>again.");
                answer = in.nextInt();
            }
            mult();
        }
    }

    public static void main(String[] args)
    {
        mult();
    }
}