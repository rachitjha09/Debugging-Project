 
/**
 * Returns the sum of integers from 1 to n.
 * 
 * @author (Rachit Jha) 
 * @version (11/16/23)
 */
public class Problem7
{
    public static int sum(int n)
    {
        int answer = 0;
        for (int i=1; i<=n; ++i)
        {
            answer += i;
        }
        return answer;
    }
    
    // there are no bugs in the main program; do not make any changes here
    public static void main(String [] args)
    {
        assert sum(5) == 15 ;
        assert sum(0) == 0;
        assert sum(3) == 6;
        System.out.println("All Tests Passed");
    }
        
}
