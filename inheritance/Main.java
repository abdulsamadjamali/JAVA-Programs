
// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat();  // Accessing base 
//         dog.bark(); 
//     }
// }
//******************************************
//      MULTI LEVEL INHERITANCE
//******************************************
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class horse extends Animal {
    void run() {
        System.out.println("horse is running");
    }
}

class cat extends horse {
    void play() {
        System.out.println("cat is playing");
    }
}

public class Main {
    public static void main(String[] args) {
        cat c1=new cat();
        c1.eat();// Accessing base class method
        c1.run();// Accessing first derived class method
        c1.play();// Accessing second derived class method    
    }
}



// class parent{
//     String name;
//     String gender;
//     public void name(){
//         System.out.println("The name os parent is "+ name);
//     }
//     public void gender(){
//         System.out.println("The gender is  "+ gender);
//     }
   
// }
// class child extends parent{
//     int age;
// public void age(){
//     System.out.println("Age of the child is "+ age);
// }
// }


// public class InnerMain {

//     public static void main(String[] args) {
//        child c1=new child();
//        parent p1=new parent();
//           c1.name="Abdul samad ";
//           c1.gender="male";
//           c1.age=22;
//           c1.age();
//           c1.gender();
//           c1.name();
//           p1.gender="Female";
//           p1.name="Aqsa";
//           p1.name();
//           p1.gender();
//     }
// }







































