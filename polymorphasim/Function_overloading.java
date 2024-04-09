class shop{
    String name;
    int price;
    void info(String name){
        System.out.println("The name of shop is " +name);
    }
    void info(String name,int price){
        System.out.println("The name of shop " + name +" and price is  " + " "+price);
    }
    void info(int price){
        System.out.println("The only price of shop is " +price);
    }
}



public class Function_overloading {
    public static void main(String[] args) {
        shop s1=new shop();
        s1.info("Bright super store");
        s1.info("Bright super store", 30000000);
    s1.info(300000);
    }
    
}
