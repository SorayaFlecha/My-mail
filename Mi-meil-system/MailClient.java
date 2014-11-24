
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // instance variables - replace the example below with your own
     // nos indida el servidor
    private MailServer server;
    // nos indida el nombre de usuario
    private String user;

    /**
     * Constructor que se agrga con un servidor y crea un usuario.
    */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }
    
    /**
     * Metodo que recupera del servidor el mensaje mandado a este usuario.
     */
    public MailItem getNexMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * Metodo que recupera del servidor el mensaje mandado 
     * a este usuario y lo imprime por pantalla.
     */
    public void printNexMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null) 
        {
            System.out.println("No hay nuevos Emails.");
        }
        else 
        {
            item.print();
        }
    }
    
    /**
     * Metodo que permite crear un mensaje y enviarsselo a 
     * un destinatario que nosotros indiquemos.
     */
    public void sendMailItem(String to, String message)
    {
        MailItem item = new MailItem(user, to, message);
        server.post(item);
    }   

    
}
