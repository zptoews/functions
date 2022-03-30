
/**
 * Write a description of class taskTwo here.
 *
 * @author Zachary
 * @version 31/03/22
 */
public class taskTwo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class taskTwo
     */
    public taskTwo()
    {
        // initialise instance variables
        x = 0;
        System.out.println(fun(5<7));
    }
    
    boolean fun(boolean cool)
        {
            System.out.println("cool is "+ cool);
          if(cool == true){
          return false;
        }else{
          return true;
        }
        
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
