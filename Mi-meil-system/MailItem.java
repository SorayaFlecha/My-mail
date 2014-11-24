
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    private String from;
    
    private String to;
    
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String message)
    {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    /**
     * Crea un mensaje. 
     */
    public String getFrom()
    {
        // put your code here
        return from;
    }
    
    /**
     * Crea un mensaje. 
     */
    public String getTo()
    {
        // put your code here
        return to;
    }
    
    /**
     * Crea un mensaje. 
     */
    public String getMessage()
    {
        // put your code here
        return message;
    }
    
    /**
     * Imprime. 
     */
    public void print()
    {
        // put your code here
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
    }
}
