public class Singleton {
 private static Singleton instace;
 private Singleton(){}
 public static Singleton getInstance()
 {
     if (instace==null)
        instace=new Singleton();
    return instace;
 } }
 class Main
 {
 public static void main(String[] args) {
     System.out.print(s.getInstance());
 }  
}


