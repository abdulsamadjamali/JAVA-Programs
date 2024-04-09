
class Animal{
    String eat;
    int noLegs;
    public void run(){
        System.out.println("Running.....");
    }


}
class goat extends Animal{
    public void eat(String eat){
        System.out.println("Goat eats "+ eat);
        
    }
    public void noLegs(int noLegs){
        System.out.println("Goat has " +noLegs);
    }
   
    
} 
class Dog extends Animal{
    public void eat(String eat){
        System.out.println("Dog eats "+ eat);
        
    }
    public void noLegs(int noLegs){
        System.out.println("Dog has " +noLegs);
    }

}

public class Inherita {
    public static void main(String[] args) {
        goat g1=new goat();
       g1.noLegs(4);
       Dog d1=new Dog();
       d1.noLegs(4);
       g1.eat("Grass");
       d1.eat("Flesh");
    }
}
