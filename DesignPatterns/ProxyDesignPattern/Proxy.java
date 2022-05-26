import java.util.*;
interface Internet
{
    public void connectTo(String serverHost) throws Exception;
}
class RealInternet implements Internet
{
    public void connectTo(String serverHost) 
    {
        System.out.println("connecting to "+serverHost);
    }
}
class ProxyInternet implements Internet
{
    private Internet internet=new RealInternet();
    private static List<String> bannedsites=new ArrayList<String>();
    static
    {
    bannedsites.add("abc.com");
    bannedsites.add("123.com");
    bannedsites.add("wxy.com");
    }
    public void connectTo(String serverHost) throws Exception
    {
        if (bannedsites.contains(serverHost.toLowerCase()))
        throw new Exception("Access Denied");
        internet.connectTo(serverHost);
    }
}
public class Proxy {
    public static void main(String[] args) {
        Internet internet=new ProxyInternet();
        try
        {
            internet.connectTo("Google.com");
            internet.connectTo("abc.com");
            
        } 
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
