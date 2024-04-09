class rap{
    public void info(String name,int age){
        System.out.println("My info "+name+ " " + age );
    }
    public void name(String name){
        System.out.println("My name is "+name);
    }
    
}
public class encapsulation {
    public static void main(String[] args) {
       rap r1=new rap();
       r1.info("abdul samad jamali", 23);
       r1.name("abdul samad");
    }
}