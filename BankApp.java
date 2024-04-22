import java.util.Scanner;

class BankAcc{
    int accNumber=1234;
    int balance; 


    public void deposit(double amount){
balance +=amount;
System.out.println("Deposited " + amount + " into account " + accNumber);
    }
    public void withDraw(Double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Unsufficant balance");
        }

    }
    public void CurrentBalance(){
        System.out.println("Your current Account  balance is :"+balance);
    }



}




class BankApp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAcc Bankacc=new BankAcc();
                System.out.println("******************************");
                System.out.println("Wellcome to Bank AL Habib");
                System.out.println("******************************");

                System.out.println("Enter your account number");
                int accNo=sc.nextInt();

    

               if (accNo==Bankacc.accNumber) {
              //System.out.println("Enter your amount that you want to deposit");
              // double depositAmount=sc.nextInt();
              // Bankacc.deposit(depositAmount);
               while (true) {

                System.out.println("1 press to check your account balance ");
                System.out.println("2 press to Deposit");
                System.out.println("3 press to WithDraw ");
                System.out.println("4 press to Exit ");
                
        int choice=sc.nextInt();
        
        switch (choice) {
            case 1:
        Bankacc.CurrentBalance();
                break;
                case 3:
                System.out.println("Enter the amount that you want to withdrw");
                Double withdrw=sc.nextDouble();
                Bankacc.withDraw(withdrw);
              
                break;
                case 2:
                System.out.println("Enter the amount That you want to deposit");
                Double Depositamount=sc.nextDouble();
                Bankacc.deposit(Depositamount);
                break;
                case 4:
                System.exit(0);
                break;
            default:
                break;
        }
        
              
            }
           
      
        }
        else{
            System.out.println("Invalid  account number");
            System.exit(0);
        }
    
}}