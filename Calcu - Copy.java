import java.util.Scanner;
import java.util.concurrent.*;;

public class Calcu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Arthmatic a1=new Arthmatic();
        int choice;
        
        do{
            System.out.println("Chose any one operation");
            System.out.println("1 : press one for addition ");
            System.out.println("2 : press 2 for multiplication");
            System.out.println("3 : press 3 for division");
            System.out.println("4 : press 4 for leaving programme");
             choice=sc.nextInt();

        switch (choice) {
            case 1:
                a1.add();
                break;
        case 2:
        a1.multi();
        break;
        case 3:
        a1.divide();
        break;
            case 4:
            System.out.println("leaving programe");
                break;
                default:
                System.out.println("Invalid char");
        }
    }while(choice !=4);

        sc.close();
    }
}
class Arthmatic{
    int a;
    int b;
    void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        a=sc.nextInt();
        System.out.println("Enter your secound number");
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("Addition of two numbers is "+ sum);
    }
    void multi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        a=sc.nextInt();
        System.out.println("Enter your secound number");
        b=sc.nextInt();
        int multi=a*b;
        System.out.println("Multiplication of two numbers is "+ multi);
    }
    void divide(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
    a=sc.nextInt();
    System.out.println("Enter your second number");
    b=sc.nextInt();
    float div=a/b;
    System.out.println("Division is : "+ div);
        
}

}

