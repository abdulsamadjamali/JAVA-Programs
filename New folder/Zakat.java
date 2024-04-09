import concepts.*;
import java.util.Scanner;
class Zakatcalculator{
Scanner sc=new Scanner(System.in);
public void goldzakat() {
	System.out.print("Enter the gold in tola:");
	double goldintola=sc.nextDouble();
	double goldNisab=7.5*224900;
	double TotalGoldValue=goldintola*224900;
	if(TotalGoldValue>=goldNisab) {
	System.out.println("Zakat is payable!");
	double ZakatAmount=TotalGoldValue*0.025;
	System.out.println("Zakat:"+ZakatAmount);
	}else {
		System.out.println("Zakat is not payable!");
	}
		
	}
public void silverzakat() {
	
	System.out.print("Enter the Silver in tola:");
	double silverintola=sc.nextDouble();
	double silverNisab=52.2*2600;
	double TotalSilverValue=silverintola*2600;
	if(TotalSilverValue>=silverNisab) {
	System.out.println("Zakat is payable!");	
	double ZakatAmount=TotalSilverValue*0.025;
	System.out.println("Zakat:"+ZakatAmount);
	}else {
		System.out.println("Zakat is not payable!");
	}	
	
	}
public void cashzakat() {
	System.out.print("Enter the Cash:");
	double Cash=sc.nextDouble();
	double CashNisab=52.2*2600;
	if(Cash>=CashNisab) {
	System.out.println("Zakat is payable!");
	double TotalCash=Cash-CashNisab;	
	double ZakatAmount=TotalCash*0.025;
	System.out.println("Zakat:"+ZakatAmount);
	}else {
		System.out.println("Zakat is not payable!");
	}	
}
public void buisnessgoodszakat() {
	System.out.print("Enter the value of your buisness Goods:");
	double Buisness=sc.nextDouble();
	double BuisnessNisab=52.2*2600;
	if(Buisness>=BuisnessNisab) {
	System.out.println("Zakat is payable!");	
	double TotalBuisness=Buisness-BuisnessNisab;
	double ZakatAmount=TotalBuisness*0.025;
	System.out.println("Zakat:"+ZakatAmount);
	}else {
		System.out.println("Zakat is not payable!");
	}
}
public void Allzakat() {
	System.out.print("Enter the gold in Tola:");
	double gold=sc.nextDouble();
	double goldcash=gold*224900;
	System.out.print("Enter the silver in Tola:");
	double silver=sc.nextDouble();
	double silvercash=silver*2600;
	System.out.print("Enter the Cash:");
	double cash=sc.nextDouble();
	System.out.print("Enter the value of your buisness Goods:");
	double Buisness=sc.nextDouble();
	double Alltotal=goldcash+silvercash+cash+Buisness;
	if(Alltotal>=136500) {
	System.out.println("Zakat is payable!");	
	double AllZakat=Alltotal*0.025;
	System.out.println("zakat:"+AllZakat);
	}else {
		System.out.println("Zakat is not payable!");
	}
		
}
	
}
public class Zakat {
	
    public static void main(String[] args) {
    	
    	
    	Scanner sc=new Scanner(System.in);
    	String choice;

        do {
    	
    	System.out.print("Enter your name: ");
    	String Name=sc.nextLine();
    	System.out.println("Welcome "+ Name + "!");
    	System.out.println("=====================");
    	System.out.println("  ZAKAT CALCULATOR ");
    	System.out.println("=====================");
    	System.out.println("  1.Gold ");
    	System.out.println("  2.silver ");
    	System.out.println("  3.Cash ");
    	System.out.println("  4.Business goods ");
    	System.out.println("  5.All ");
    	System.out.println("  Enter your choice:");
    	int option=sc.nextInt();
    	sc.nextLine(); 
    	Zakatcalculator obj1= new Zakatcalculator();
    	if (option==1) {
    		
    		obj1.goldzakat();
    		
    	}
    	else if (option==2) {
    		
    		obj1.silverzakat();
    	}
    	else if (option==3) {
    	
    		obj1.cashzakat();
    	}
    	else if (option==4) {
    		obj1.buisnessgoodszakat();
    	}
    	else if (option==5) {
    	obj1.Allzakat();
    	}else {
    		System.out.println("Invalid Choice!");
    	}
    	System.out.println("Do you want to calculate zakat again? (yes/no)");
        choice = sc.nextLine();
    } while (choice.equalsIgnoreCase("yes"));
    
    System.out.println("Thank you for using the Zakat Calculator.");
    		
    	}}
    