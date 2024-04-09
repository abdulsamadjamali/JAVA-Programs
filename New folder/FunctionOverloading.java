class Doctor{
    String name;
    int id;
    public void name(String name){
        System.out.println("name of doctor is "+name);
    }
    public void info(String name,int id){
        System.out.println("The name of doctor is " + name + "  Doctor id : " +id);
    }
    public void op(){
        System.out.println(name + " "+ id);
    }
}

public class FunctionOverloading {
    public static void main(String[] args) {
        Doctor d1=new Doctor();
        d1.name("Abdul samad jamali");
        d1.info("Abdul samad", 11);
       d1.name="Abdul samad jamali";
       d1.id=21;
        d1.op();
    }
}
