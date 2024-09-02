
/**
 * Adds two numbers and prints the result.
 * 
 * @author (Rachit Jha) 
 * @version (11/16/23)
 */
public class Problem6
{

    // public method for Problem6
    public static int sum(int a, int b)
    {
        return a+b;
    }
    
    public static void main(String [] args)
    {
    int answer = 0;
    Problem6 p=new Problem6();
    answer=p.sum(3,4);
    System.out.println("Sum of 3 and 4 is "+answer);
    }
}
