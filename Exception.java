package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
 

public class Exception {
public static void main(String[] args) {
    System.out.println("Starting.....");
    Scanner sc=new Scanner(System.in);
    try{
        
    int a,b;
    System.out.println("Enter First number ");
    a=sc.nextInt();
    System.out.println("Enter Secound number ");
    b=sc.nextInt();
    if(a==b) {
       
    }
    float result=a/b;
    System.out.println("Result = "+result);
    }
    catch(ArithmeticException e){
        //System.out.println("Secound number can not be zero");
        System.out.println(e.getMessage());
    }
    catch(InputMismatchException e){
        System.out.println("Not valid input");
        System.out.println(e.getMessage());
    }
    System.out.println("Programe Terminated");
        
    
}
    
}