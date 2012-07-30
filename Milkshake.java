//Chris Dildy
//Milkshake app .01

import java.util.Scanner;
import java.util.Random;

public class Milkshake
{
 public static Scanner kb;
 public static void main(String[] args)
 {
 	Random generator = new Random();
 	kb = new Scanner(System.in);
 	int choice1 = generator.nextInt(40) + 1;
 	int choice2 = generator.nextInt(40) + 1;
 	int choice3 = generator.nextInt(40) + 1;

 	System.out.println("How many flavors would you like? (Maximum 3)");
 	int choices = kb.nextInt();
 	if (choices <=0 || choices > 3)
 	{
 	System.out.println("You have made an invalid selection,please try again");
 	}
 	
 	else if (choices == 3)
 	{
 	System.out.println("You are bold! 59,280 possibilities!");
 	System.out.println(choice1 + " " + choice2+ " " + choice3);
 	}
 	
 	else if (choices == 2)
 	{
 	System.out.println("You trying to play it safe with 1,560 possibilities!");
 	System.out.println(choice1 + " " + choice2);
 	}else{
 	System.out.println("Only one flavor? Boring!");
 	System.out.println(choice1);
 	}
 }
}
 
	

