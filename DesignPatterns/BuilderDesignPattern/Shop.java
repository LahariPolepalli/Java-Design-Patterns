class PhoneBuilder
{
    private String os;
    private String processor;
    private int ram,battery;
    private double displaysize;
    public PhoneBuilder setOss(String os) {
        this.os = os;
        return this;

    }
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;

    }
    public PhoneBuilder setDisplaysize(double displaysize) {
        this.displaysize = displaysize;
        return this;

    }
    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;

    }
    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(os,processor,ram,battery,displaysize);
    }

}

class Phone
{
    private String os;
    private String processor;
    private int ram,battery;
    private double displaysize;
    public Phone(String os,String processor,int ram,int battery,double displaysize)
    {
        this.os=os;
        this.processor=processor;
        this.battery=battery;
        this.ram=ram;
        this.displaysize=displaysize;
    }

    public String toString()
    {
        return "Phone specifications\n Os = "+os +"\n Processor = "+processor+"\n Ram = "+ram+"\n Display size = "+displaysize+"\n Battery = "+battery;
    }
}

public class Shop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOss("Android").getPhone();
        System.out.print(p);
    }
}
