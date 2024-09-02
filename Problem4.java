
/**
 * Should print the odd numbers from 1 to 20
 * 
 * @author (Rachit Jha) 
 * @version (11/16/23)
 */
public class Problem4
{
    public static void main(String [] args)
    {
        for (int i = 1; i<21; ++i){
            if ( (i%2)!=0 )
                System.out.println(i);
        }
    }
}