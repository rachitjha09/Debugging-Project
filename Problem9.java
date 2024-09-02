
/**
 * Should evaluate and print x! (x factorial). For example 3! = 3*2*1 = 6; 5! = 5*4*3*2*1 = 120; etc.
 * 
 * @author (Rachit Jha) 
 * @version (11/16/23) 
 */
public class Problem9
{
    // there is something wrong in this factorial method. Fix it.
    public static int factorial(int x)
    {
        if (x==0){ 
            return 1;
        }
        int product = 1;
        for (int i=x; i>0; --i)
        {   
            product *= i;
        }
        return product;
    }
    
    // there are no bugs in the main method. do not make any changes here.
    public static void main(String [] args)
    {
        assert factorial(5) == 120;
        assert factorial(0) == 1;
        assert factorial(1) == 1;
        assert factorial(2) == 2;
        System.out.println("All tests passed");
    }
}

