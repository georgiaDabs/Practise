
/**
 * Write a description of class IP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IP
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class IP
     */
    public IP()
    {
        int x=10;
        int y=20;
        System.out.println(x+y+" hello"+x+y);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        String y="Stephen";
        System.out.println(y.equals("STEPHEN"));
        System.out.println(y.equals("Stephen"));
    }

    public void method(){
        int a = 1;
        int b = 2;
        int c = 3; 
        c += a * b;
        c %= 3;
        System.out.println(c);
    }
   public void method2(){
        int balance1 = 100;
int balance2 = 200;
double rate = 0.05;
double interest1 = balance1 + balance2 * rate;
double interest2 = (balance1 + balance2) * rate;
System.out.println(interest1+" "+interest2+""st1);
    }
}
