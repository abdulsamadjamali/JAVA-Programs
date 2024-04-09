package poly;

public class person {
    public void showDetails(){
        System.out.println("Basic details of person");
    }

}
class emp extends person{
    public void showDetails(){
        System.out.println("The name of employ is  ");
    }
}
class abdulSamd{
    public void dowork(person p1){
p1.showDetails();
    }

}







