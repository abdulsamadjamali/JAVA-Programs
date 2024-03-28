import java.lang.Thread;
import java.util.Scanner;
public class threads  extends Thread {
  public void run(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your input");
    int z=scanner.nextInt();
    if(z>0){
    for(int a=0;a<=3;a++){
System.out.println("Abdul samad "+a);
    }
   }
}
    public static void main(String[] args) {
        threads t1=new threads();
        t1.start();

        
    }

    


}
