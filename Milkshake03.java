//Chris Dildy
//Milkshake app .03

import java.io.*;
import java.util.*;
import java.lang.*;

public class Milkshake03
{
 private static int MAXFLAVORS = 209;
 public static int POS = 0;
// public static int counter = 1;
 public static Scanner kb;
 public static String[] shakeArray = new String[MAXFLAVORS];
 
 public void readShakes(String Shakes)
 {
 	 try {
 	 	 File file = new File(Shakes);
 	 	 Scanner input = new Scanner(file);
 	 	 
 		 String[] shakeArray = new String[MAXFLAVORS];
 	 	 
 	 	 while (input.hasNext())
 	 	 {
 	 	  	 String mShakes = input.next();
 	 	  	 shakeArray[POS] = mShakes;
 	 	 	 POS++;
 	 	 }
 	 	 input.close();
 	 } catch (FileNotFoundException e){
 	 	 e.printStackTrace();
 	 }
 }
 
 public static void main(String[] args)
 {
 	 if (args.length != 1)
 	 {
 	 	 System.err.println("EMPTY FILE!");
 	 	 System.exit(0);
 	 }
 	Milkshake03 mShakes = new Milkshake03();
 	mShakes.readShakes(args[0]);
 	
 	Random generator = new Random();
 	kb = new Scanner(System.in);
 	int choice1 = generator.nextInt(MAXFLAVORS) + 1;
 	int choice2 = generator.nextInt(MAXFLAVORS) + 1;
 	int choice3 = generator.nextInt(MAXFLAVORS) + 1;

 	System.out.println("How many flavors would you like? (Maximum 3)");
 	int choices = kb.nextInt();
 	if (choices <=0 || choices > 3)
 	{
 	System.out.println("You have made an invalid selection,please try again");
 	}
 	
 	else if (choices == 3)
 	{
 	System.out.println("You are bold! 59,280 possibilities!");
 	System.out.println(shakeArray[choice1] + " " + shakeArray[choice2]+ " " + shakeArray[choice3]);
 	}
 	
 	else if (choices == 2)
 	{
 	System.out.println("You trying to play it safe with 1,560 possibilities!");
 	System.out.println(shakeArray[choice1] + " " + shakeArray[choice2]);
 	}else{
 	System.out.println("Only one flavor? Boring!");
 	System.out.println(shakeArray[choice1]);
 	}
 }
}
