
package FirstProgram;
import java.util.*;
public class Tested
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        Tree numbers = new Tree();
        
        while(true)
        {
            System.out.println("Enter number :");
            value=scan.nextInt();
           if(numbers.search(value))
           {
             //  int number=value;
               break;
           }
           numbers.add(value);
            
            
        }
        
        System.out.println("The program  stopped : ");
       
    }
  
}
