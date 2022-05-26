interface OS
{
    void spec();
}
class Android implements OS
{
    public void spec()
    {
        System.out.print("Os easy to handle");
    }
}
class IOS implements OS
{
    public void spec()
    {
        System.out.print("Os difficult to handle");
    }
}
class Windows implements OS 
{
    public void spec() 
    {
        System.out.print("Os about to die");    
    }

}
class OperatingSystemFactory
{
    public OS getInstance(String str)
    {
        if (str.equals("Easy"))
            return new Android();
        else if(str.equals("Difficult"))
            return new IOS();
        else
            return new Windows();
    }
}
public class Factory
{
    public static void main(String[] args) {
        OperatingSystemFactory osf=new OperatingSystemFactory();
        OS obj=osf.getInstance("window");
        obj.spec();
    }
}
