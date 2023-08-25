/**
 *This program display a greeting for the reader
 * @version 20.0.2 2023-07-18
 * @author afisk
 */
public class Welcome 
{
    public static void main(String[] args) 
    { 
       String greetings = "Welcome to Core Java!";
        System.out.println(greetings);
        for (int i = 0; i < greetings.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}