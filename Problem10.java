
/**
 * 
 * Given 2 positive int values, return the larger value 
 * that is in the range 10..20 inclusive, or return 0 if 
 * neither is in that range.
 *
 * @author (Rachit Jha)
 * @version (11/22/23)
 */
public class Problem10
{

   public static int max1020(int a, int b) {
       if (b>a) {
          /* int temp = a;
           a = b;
           b = temp;
           */
          if (b >= 10 && b <= 20){ 
              return b; 
          } else if (a >= 10 && a <= 20){ 
              return a; 
          } else{
              return 0; 
          } 
       } else{
          if (b >= 10 && b <= 20){ 
              return b; 
          } else if (a >= 10 && a <= 20){ 
              return a; 
          } else{
              return 0; 
          }  
       }
   }
   
   public static void main (String [] args) {
       assert max1020(8,9) == 0;
       assert max1020(19,20) == 20;
       assert max1020(19, 21) == 19;
       System.out.println("all tests passed");
   }
   
}
