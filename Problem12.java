
/**
 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
 * @author (Rachit Jha) 
 * @version (11/25/23)
 */
public class Problem12
{

    public static boolean shareDigit(int a, int b) {
        int aL = a/10;
        int aR = a%10;
        int bL = b/10;
        int bR = b%10;
        if((a>=10 && a<=99) && (b>=10 && b<=99)){
            if(aL==bL || aL==bR || aR==bL || aR==bR){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }
    
    // there are no bugs in this main program. do not make any changes here
    public static void main (String [] args) {
        assert !shareDigit(32,57);
        assert shareDigit(32,37);
       System.out.println("All tests passed");
    }
    
}
