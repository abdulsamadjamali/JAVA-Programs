class Car{
    String name;
    int model;
    void info(){
        System.out.println("NAME OF THIS CAR IS"+name);
        System.out.println("Age of this car is "+age);
 
    }
    Car(Car c2){
        this.name=c2.name;
        this.model=c2.age;
 
    }
    Car(){

    }
}



public class makar {

    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="Corolla";
        c1.model=2022;
        Car c2=new Car(c1);
c2.info();
    }
}
