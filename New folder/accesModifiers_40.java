import concepts.*;

class Student{
    int age;
   private String name;
   public void setName(String n){
this.name=n;
   }
   public String getName(){
 return name;
       }

} 



public class accesModifiers_40 {
    public static void main(String[] args) {
      Student s1=new Student();
      s1.age=21;
        s1.setName("Abdul samad jamali");
        System.out.println(s1.getName());
        System.out.println(s1.age);
    }
}
