package Bazzar;
import java.util.*;
public class MainFinal {
	static int signdone;
	static String name;
	static String pwd;
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		Body1 o=new Body1();
		boolean in=true;
		while (in)
		{
		System.out.println("\n\t********Welcome to Bank Bazzar********");
		System.out.println("\nChoose:\n\t1. Signup\n\t2. Login\n\t3. Exit");
		System.out.print("\nEnter Number Here---> ");
		int us=s.nextInt();
		switch (us)
		{
		case 1:
		{
		System.out.print("\n\t\t*****Signup*****");
		System.out.print("\nEnter Your Name: ");
		name=s.next();
		System.out.print("\nEnter Your Password:");
		pwd=s.next();
		System.out.print("\nEnter Your Contact no:");
		long contact=s.nextLong();
		System.out.println("\n\t\t*****Sig Up Done*****");Thread.sleep(1000);	
		signdone++;
		}break;
		case 2:
		{
			if (signdone==1)
		{
		System.out.println("\n\t\t****Login Here*****");
		System.out.print("\nUser Name: ");
		String one=s.next();
		System.out.print("\nPasword Name: ");
		String two=s.next();
		if (one.equals(name) && two.equals(pwd))
		{
		System.out.println("\n \t\t*****Login Succesfully*****");Thread.sleep(3000);
			boolean flag=true;
		while (flag)
		{
		System.out.println("\n*******Welcome to Bank Bazzar Webpage*********");
		System.out.println("\nChoose the Service:\n\t1. Loan\n\t2. Cards\n\t3. Visa\n\t4. Exit");
		System.out.print("\nEnter Here: ");
		int user=s.nextInt();
		switch (user)
		{
		case 1:
			{
				o.loanCatergory();
			System.out.println("\n*************************************");
			}break;
		case 2:
			{
			o.cardsCatergory();
			}break;
		case 3:
			{
				o.visaCategory();
			}break;
		case 4:
			{
			System.out.println("\n\t\t****Back to home page*****");
			flag=false;
			}break;
		default :
			{
				System.out.println("\n\t\t*****Invalid Input*****");
			}
		}}}
		else
			{
		System.out.println("\n\t\t****Creditional wrong****");
			}}
			else{
				System.out.println("\n\t\t****Sign-Up First****");
			}}
			break;
		case 3:
		{
			if (signdone==1)
			{
			System.out.println("\n\t\t****Thanks for visit us Page****");
			in=false;
			signdone=0;
			}else{
				System.out.println("\n\t\t****Signup First****");
			}
		}break;
}}}
}
