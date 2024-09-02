
/**
 * Should print the prime numbers from 1 to 50.
 * 
 * @author (Rachit Jha) 
 * @version (11/25/23)
 */
public class Problem15
{
    public static boolean  isPrime(int x)   // returns true if x is a prime
    {
        for (int i=2; i<=Math.sqrt(x); ++i)
        {
            //System.out.println(x+"%"+i+"="+x%i);
            if ((x%i) == 0){
                return false;
            }
        }
        return true;
       // System.out.println("Answer is:"+answer);
    }
    public static void main(String [] args)
    {
        for (int i = 2; i<=50; ++i){
                if (isPrime(i)){
                    System.out.println(i+ " is prime.");
                }
        }
    }
}