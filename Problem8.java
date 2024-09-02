import java.util.Scanner;
/**
 * Supposed to calculate the average of two numbers.
 * 
 * @author (Rachit Jha) 
 * @version (11/16/23)
 */
public class Problem8
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = kb.nextInt();
        int average = (num1+num2)/2;
        System.out.print("Average of "+ num1 +" and "+ num2 +" is: "+average);
        
    }
}
