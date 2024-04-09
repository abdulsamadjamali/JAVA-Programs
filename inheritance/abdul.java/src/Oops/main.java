package Oops;

public class main {
    public static void main(String[] args) {
        person p1=new person();
        p1.info("faraz");

    }
}
class person{
    public void info(){
        System.out.println("The name of student is ");
    }
    public void info(String name){
        System.out.println("The name of student is " + name + "");

    }


}
