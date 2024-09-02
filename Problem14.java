
/**
 * 
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. 
 * However, if noDoubles is true, if the two dice show the same value, 
 * increment one die to the next value, wrapping around to 1 if its 
 * value was 6.
 * 
 * @author (Rachit Jha)
 * @version (11/25/23)
 */
public class Problem14
{

    
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles) {
            if (die1==die2) {
                if (die1!=6)
                    return die1 + 1 + die2;
                else
                    return 1 + die2;
            } 
        }
        
        return die1 + die2;
    }
    
    // there are no bugs in the main method, below. make no changes here.
    public static void main (String [] args) {
        assert withoutDoubles(6,6,false) == 12;
        assert withoutDoubles(6,6,true) == 7;
        assert withoutDoubles(3,5,true) == 8;
        assert withoutDoubles(3,3, true) == 7;
        System.out.println("All tests passed.");
    }

}
