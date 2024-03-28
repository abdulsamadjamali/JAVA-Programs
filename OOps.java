import java.util.Scanner;

class calculator{
    int a;
    int b;
    
    void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        a=sc.nextInt();
        System.out.println("Enter secound number");
         b=sc.nextInt();
        int total=a+b;
        System.out.println(total);
    }
    void multi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        a=sc.nextInt();
        System.out.println("Enter secound number");
         b=sc.nextInt();
        int total=a*b;
        System.out.println(total);
    }
    void divide(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        a=sc.nextInt();
        System.out.println("Enter secound number");
         b=sc.nextInt();
        int total=a/b;
        System.out.println(total);
    }

}
public class OOps {

    public static void main(String[] args) {
            calculator cl1=new calculator();
            int choice;
            do{
                System.out.println("Enter  for addition");
                sSystem.out.println("Enter 2 for multiplication");
                System.out.println("Enter three for division");
                System.out.println("Enter 4 to exit the code");
                switch (choice) {
                    case 1:
                        cl1.add();
                        break;
                        case 2:
                        cl1.multi();
                        break;
                        case 3:
                        cl1.divide();
                        break;

                
                    default:
                    System.out.println("Some wents rong");
                        break;
                }
            } while (choice !=4);























        
    }
}

