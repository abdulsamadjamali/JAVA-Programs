abstract class Animal{
    abstract void walk();
}
class horse extends Animal{
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
class chicken extends horse{
void walk(){
    System.out.println("Chicken walks on 2 legs");
}
}
public class constructor {

    public static void main(String[] args) {
        Animal an=new Animal();
        an.walk();
    }
}
