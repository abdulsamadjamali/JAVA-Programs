class Student{
  private  String name;
   private int id; 
  
   public   String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public void setId(int id) {
       this.id = id;
   }
   public int getId() {
       return id;
   }


   }

public class Encap {
  public static void main(String[] args) {
    Student s1=new Student();
 s1.setId(12);
 s1.setName("Faraz");  
 System.out.println(s1.getName()+ " : "+s1.getId());
  
}  
 
}
