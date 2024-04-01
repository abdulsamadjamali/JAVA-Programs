import java.util.Scanner;


//   solving basic of Object Oriented Programming



class Employe{
    String name;
    int age;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int Age){
    age=Age;
    }
    public int getAge(){
        return age;
    }
    

    }  


    class Cellphone {
        public void Ringing(){
            System.out.println("Ringing....");
            
        }
    public void Vibrating(){
        System.out.println("Vibrating.....");
    }
    }



    class Square{
        int side;
        public int area(){
              return side*side;
          
        }
        public int parameter(){
            return 4*side;
        }
    }  



    class rectangle{
        int l;
        int b;
        public int area(){
            return l*b;
        }
        public int Parameter(){
            return 4*(l+b);

        }
        
    }
    class Tomy{
        public void fir(){
            System.out.println("Firing on enemy");
        }
        public void run(){
            System.out.println("running from the enemy");
        }
        public void hit(){
            System.out.println("hitting the  enemy");
        }
    }



public class oop_basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employe e1=new Employe();
        e1.setName("Abdul samad jamali");
        e1.age=21;
        System.out.println( "Your name is : " +e1.getName());
        System.out.println( "Your age is : " +e1.getAge());
        
        Cellphone c1=new Cellphone();
        c1.Ringing();
        c1.Vibrating();
        
        Square s1=new Square();
        s1.side=5;
        System.out.println("Area of square is = " +s1.area());
        System.out.println("Peremeter of square is = "+s1.parameter());
    
        rectangle t1=new rectangle();
        System.out.println("Enter the length of rectabgle");
        t1.l=sc.nextInt();
        System.out.println("Enter the width of rectabgle");
        t1.b=sc.nextInt();
        System.out.println("Area of rectangle is = " +t1.area());
        System.out.println("parameter of rectangle is = "+t1.Parameter());
        
        Tomy tt1=new Tomy();
        tt1.fir();;
        tt1.run();
        tt1.hit();
        }
}
