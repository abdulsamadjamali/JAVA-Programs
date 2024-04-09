 abstract class Parent{
    public void calling(){
        System.out.println("They are calling you");
    }
    public abstract  void greeting();
}
class child extends Parent{
public void greeting(){
    System.out.println("Hey good morning");
}
}
class child2 extends Parent{
   public void greeting(){
    System.out.println("Neee how");
   }
}


public class Abstrac {
    public static void main(String[] args) {
       
            
        child c1=new child();
        c1.calling();
        c1.greeting();
        child2 c2=new child2();
        c2.greeting();
    
        
    }
}
