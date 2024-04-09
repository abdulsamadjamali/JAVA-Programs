import concepts.*;
//******************************** 
//             CONSTRUCTOR
//*******************************




















//**************************************
//           *** INHERITANCE ***
//**************************************

// class student{
//     String name;
//     int age;
// }
// class student2 extends student{
// String fathersName;
// }
// class student3 extends student2{
// int rollNo;
// }
// class student4 extends student{
// String DeptName;
// }
// public class practise {

//     public static void main(String[] args) {
//         student2 s2=new student2();
//         s2.name="Abdul samad jamali";   
//         s2.fathersName="Abdul qadir jamali";
//         s2.age=21;
//         System.out.println("Fathers name of secound student is "+s2.fathersName);
//         System.out.println("The name of secound is "+s2.name);
//         System.out.println("The age of secound student is "+s2.age);
//         student s1=new student();
        
//         s1.name="faraz";
//         s1.age=22;
//         System.out.println(s1.name);

//         student3 s3=new student3();
//         s3.fathersName="Abdullah";
//         System.out.println("The fathers name of third student is "+s3.fathersName);

//         student4 s4=new student4();
//         s4.DeptName="Artificial intelligance";
//         System.out.println(s4.DeptName);
//     }
// }

//********************************
//     Access Modifier
//********************************

// class account {
//     int number;
//     public String name; 
//     protected String Email; 
//     private String password;

//     public void setpassword(String psss) {
//         this.password = psss;
//     }

//     public String getpassword() {
//         return this.password;
//     }
// }

// public class practise {
//     public static void main(String[] args) {
//         account ac1 = new account();
//         ac1.Email = "AbdulSamadjamali115@gmail.com";
//         ac1.name = "Abdul samad jamali";
//         ac1.number = 5323526;
//         System.out.println(ac1.name);
//         System.out.println(ac1.Email);
//         System.out.println(ac1.number);
//         ac1.setpassword("jamali123");
//         System.out.println(ac1.getpassword());
//     }
// }


/*************************************** 
      ***   Encapsulation ****
**************************************
 Encapsulation mtlb ka ap data or unka  Functions
 ko combine kr dn ak he entity mn
 */

 
// class account {
//     private String name;
//     private String password;
//     private String Email;

//     public String getname(){
//         return name;
//     }
//     public void setname(String name){
//         this.name = name; 
//     }

//     public String getpassword(){
//         return password;
//     }
//     public void setpassword(String pass){
//         password=pass;
//     }
//     public String getemail(){
//         return Email;
//     }
//     public void setemail(String email){
//         Email=email;
//     }
// }

// public class practise {

//     public static void main(String[] args) {
//         account acc=new account();
//         acc.setname("abdul samad");
//         acc.setemail("jamali4u@gmail.com");
//         acc.setpassword("********");
//         System.out.println(acc.getpassword());
//         System.out.println(acc.getemail());   
//         System.out.println(acc.getname());
//     }
// }





















