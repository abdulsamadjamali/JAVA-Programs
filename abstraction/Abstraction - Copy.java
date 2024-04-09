
 //************************** 
 //        Abstract e.g
 //***************************
 
//  abstract class animal{
//    abstract void walk();

    
// }
// class horse extends animal{
// void walk(){
//     System.out.println("Horse acn walk on 4 legs");
// }
// }
// class chicken extends animal{
//     void walk(){
//         System.out.println("Chicken can walk on 2 legs");
//     }
// }
// public class Abstraction {

// public static void main(String[] args) {
//     horse h1=new horse();
//     h1.walk();
//     chicken c1=new chicken();
//     c1.walk();
// }
// }

//**************************** 
//     Interface e.g
//****************************
// interface Animal {
//     int EYE = 2; 
//     void walk();
// }

// class Horse implements Animal {
//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         Horse h1 = new Horse();
//         h1.walk();
//     }
// }
















class Livingthing{
    boolean isAlive;



    public void reproduce(){
        System.out.println("can reproduce");
    }
}
class Plant extends LivingThing{
    public void photosynthesis(){
        System.out.println("Photosynthesis for plant");

    }

}
class Animal extends LivingThing{
    public void move(){
        System.out.println("Animals can move");
    }

}


public class Abstraction {

    public static void main(String[] args) {
        
     Animal ani=new Animal();
     ani.reproduce();
      ani.isalive=true;
      ani.move();

System.out.println("ALL ABOUT PLANT");
Plant p1=new Plant();
p1.isAlive=true;
p1.photosynthesis();
p1.reproduce();







    }
}























