//Write a java program  to take name,gender,age,Fathername,MotherName as input.
//(Monolithic Approach of Programming). 
import java.util.Scanner;
class Input
{
	 public static void main(String...args)
	{
		int age=0;
		String name;
        char gender;
        String FatherName;
        String MotherName;
        //Creating the object of Scanner class to access the method of Scanner class.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name pllzz");
        name=sc.nextLine();
        System.out.println("Enter your gender pllzz");
        gender=sc.next().charAt(0);
        System.out.println("Enter your age pllzz");
        age=sc.nextInt();
        sc.nextLine();//By consuming the leftover new line using the nextLine() method  
        System.out.println("Enter your Father name pllzz");
        FatherName=sc.nextLine();
        System.out.println("Enter your Mother name pllzz");
        MotherName=sc.nextLine();
        System.out.println("Print the Enter Values");
        System.out.println("Your name="+name);
        System.out.println("Your Gender="+gender);
        System.out.println("Your age="+age);
        System.out.println("Your Father Name="+FatherName);
        System.out.println("Your Mother Name="+MotherName);
	}
}