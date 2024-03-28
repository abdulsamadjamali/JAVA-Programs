
//******************************************
//      SINGLE LEVEL INHERITANCE
//******************************************
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

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void play() {
        System.out.println("Labrador is playing");
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();  // Accessing base class method
        labrador.bark(); // Accessing first derived class method
        labrador.play(); // Accessing second derived class method
        System.out.println(labrador.eat);
    }
}

















































