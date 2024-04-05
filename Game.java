import java.util.Random;
import java.util.Scanner;

public class Game {
 
    public static void main(String[] args) {
        System.out.println("Hello and welcome to the rock paper and scissor game");
        System.out.println("0 for Rock  ");
        System.out.println("1 for paper  ");
        System.out.println("2 for Scissor  ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Give your Input");
        int userInput=sc.nextInt();
        Random random=new Random();
        int computerInput= random.nextInt(3);
        if(userInput==computerInput){
            System.out.println("Draw");
        } else if ((userInput == 0 && computerInput == 2)||
                 (userInput == 1 && computerInput == 0)||
                 (userInput == 2 && computerInput == 1))
        {
            System.out.println("You won");
        }
        else {
            System.out.println("You loss");
        }
        System.out.println("Your input = "+userInput);
        System.out.println("Computer input = "+computerInput);



    }
}