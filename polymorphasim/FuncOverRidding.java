import poly.person;

class Person{
    public void showDetails(){
        System.out.println("The basic details of person");
    }
}
class Employe extends Person{
    public void showDetails(){
        System.out.println("Sowing the details of the employee");
    }
}


public class FuncOverRidding {
    public static void main(String[] args) {
       //Person p1=new Person();
       Person p1=new Employe();
       p1.showDetails();
    }

}
