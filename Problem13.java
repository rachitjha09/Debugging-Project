
/**
 * Returns the number with all the digits in reverse order. 
 * So the call reverse(123) returns 321.
 * 
 * @author (Rachit Jha) 
 * @version (11/25/23)
 */
public class Problem13
{

    public static int reverse (int n) {
        int rem = 0;
        int revNum = 0;
        
       while(n !=0){
           rem=n%10;
           revNum=revNum*10+rem;
           n/=10;
       }
        
        return revNum;
    }
    
    // there are no bugs in this main program. do not make any changes here
    public static void main (String [] args) {
        assert reverse(198) == 891;
        assert reverse(12345) == 54321;
        assert reverse(7) == 7;
        System.out.println("All tests passed.");
    }
    
}
