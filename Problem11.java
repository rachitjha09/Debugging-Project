
/**
  * Should print the first n numbers of the fibonacci series starting from 1
 * Ex: fibonacci(6) should print 1, 1, 2, 3, 5, 8
 * @author (Rachit Jha) 
 * @version (11/22/23)
 */
public class Problem11
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Problem11
     */
    public static void main (String [] args) {
        fibonacci(6);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void fibonacci(int n)
    {
        if (n <= 1) {
            System.out.println(n);
        }
        
        int fibo = 1;
        int fiboPrev = 0;
        int temp;
        for (int i = 1; i<=n; ++i) {
            System.out.println(fibo);
            temp = fibo;
            fibo += fiboPrev;
            fiboPrev = temp;

        }
        
    }
}
