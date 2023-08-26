package Bazzar;
import java.util.*;
public class Body1 implements BankBazzar {
	static Scanner s=new Scanner(System.in);
	
	static int amount;
	//citizenship
	
	public String citizenship(long aadharno, String cname) {
		return aadharno+" "+ cname;
	}
	
	//loan category
	public void loanCatergory()
	{ 
		boolean fl=true;
	while(fl) 
	{	
		System.out.println("\nChoose the loan: ");
		System.out.println("\n1. Personal Loan \n2. Home Loan \n3. Bike Loan \n4. Education Loan \n5. Exit");
		System.out.print("Enter here--->");
		int a=s.nextInt();
		switch(a)
		{
		case 1:
		{ System.err.println("\n\t******Personal Loan*******");
			System.out.println("\nThe rate of interest 5% is Personal Loan");
			System.out.print("\n\tEnter your Personal Loan requesting amount :");
			amount=s.nextInt();
			Process(amount);
		}break;
		case 2:
		{ System.err.println("\n\t******Home Loan*******");
			System.out.println("\nThe rate of interest 7.5% is Home Loan");
			System.out.print("\n\tEnter your Home Loan requesting amount :");
			amount=s.nextInt();
			Process(amount);
		}break;
		case 3:
		{ System.err.println("\n\t******Bike Loan*******");
			System.out.println("\nThe rate of interest 12.5% is Bike Loan");
			System.out.print("\n\tEnter your Bike Loan requesting amount :");
			amount=s.nextInt();
			Process(amount);
		}break;
		case 4:
		{ System.err.println("\n\t******Education Loan*******");
			System.out.println("\nThe rate of interest 6% is Education Loan");
			System.out.print("\nEnter your Education Loan requesting amount :");
			amount=s.nextInt();
			Process(amount);
		}break;
		case 5:
		{
			System.out.println("\t\tThank You");
			fl=false;
		}
		default :
		{
			System.err.println("\n\nWrong input");
		}
		}}
	}
	//cards category
	public void cardsCatergory()
	{
		boolean ca=true;
		while(ca) {
		System.out.println("\nChoose the Payment Options:\n\t1. Debit Card\n\t2. Credit Card\n\t3. Exit");
		System.out.print("Enter here--->");
		int pc=s.nextInt();
		switch(pc) 
		{
		case 1:
		{
			System.out.println("\n\t\t*******Enter the Debit card Details*******");
			cards();
		}
		break;
		case 2:
		{
			System.out.println("\n\t\t*******Enter the Credit card Details*******");
			cards();			
		}break;
		case 3:
		{
			System.out.println("Thank You For Visit Us Page");
			ca=false;
		}break;
		default :
		{
			System.err.println("\n\tInvalid Input");
		}
		}}
	}

	//visa Category
	public void visaCategory() {
		System.out.println("\n\t******Welcome to Visa Board Page*********");
		boolean va=true;
		while(va) {
		System.out.println("\nChoose the Visa Category:\n\t1. Travel Visa\n\t2. Student Visa\n\t3. Business Visa\n\t4. Exit");
		int pc=s.nextInt();
		switch(pc) {
		case 1:
		{
			System.out.println("\n\t\t******Travel Visa*******");
			visa();
		}break;
		case 2:
		{
			System.out.println("\n\t\t******Student Visa*******");
			visa();			
		}break;
		case 3:
		{
			System.out.println("\n\t\t******Business Visa*******");
			visa();
		}break;
		case 4:
		{
		System.out.println("\n\tThanks for Visit our page");
			va=false;
		}break;
		default :
		{
			System.err.println("********INVALID CREDENTIALS*******");
		}
		}
		}
	}
	
	//visa processing Details
	public static void visa() {
		System.out.print("\nEnter your Name: ");
		String vn=s.next();
		System.out.print("\nFor What purpose going there: ");
		String vs=s.next();
		System.out.print("\nHow much long u will be stay there: ");
		String vl=s.next();
		System.out.print("\nEnter mobile number :");
		long vp=s.nextLong();
		System.out.print("Click Y to Proceed: ");
		String vc=s.next();
		if(vc.equalsIgnoreCase("Y")) {
		System.out.println("Otp generating.....");
		int votp=(int)(Math.random()*9999+9999);
		System.out.println(votp);
		System.out.print("Enter the Otp here");
		int uotp=s.nextInt();
		if(votp==uotp) {
		System.out.println("\n**********VISA DETAILS***********\n");
		System.out.println("\tName is :"+ vn);
		System.out.println("\tPurpose is :"+ vs);
		System.out.println("\tNumber of Days is :"+ vl);
		System.out.println("\tContact no. is :"+ vp);
		System.out.println("\n**************************************\n");
		System.err.println("\t*****Your Details is Fetched succesully*****");
		}else {
			System.err.println("********Invalid otp********");
		}
		}else
		{
			System.err.println("********Enter Wrong creditionals********");
		}}
	
	//card Processing Details
	public static void cards() {
		System.out.print("\nEnter the Card Number: ");
		long car=s.nextLong();
		System.out.print("\nEnter the Card Cvv number: ");
		int cvv=s.nextInt();
		System.out.print("\nEnter the Card Issued Date: ");
		String id=s.next();
		System.out.print("\nEnter the Card Expiring Date: ");
		String ed=s.next();
	
		System.out.print("\nEnter Yes to fetch the details: ");
		String fe=s.next();
		if(fe.equalsIgnoreCase("yes")) {
		System.out.println("\n*******Card Details Fetched Succesfully*******");
		System.out.println("\n\tCard Number : "+car);
		System.out.println("\tCvv Number  : "+cvv);
		System.out.println("\tIssued Date : "+id);
		System.out.println("\tExpire Date : "+ed);
		System.out.println("\n********************************************");
		}else {
			System.err.println("\n\tInvalid Data Entered");
		}
	}
	
	
	//amount processing
	public static void Process(int amount) {
		if(amount<50000)
		{
			System.out.println("\nYou requested amount is :" + amount);
			System.out.println("\nAfter verfication your loan will be approved.....");
			System.out.print("\nEnter your mobile number to verify :");
			long lo=s.nextLong();
			System.out.println("\nGenerating otp....");
			int otp=(int)(Math.random()*9999+9999);
			System.out.println(otp);
			System.out.print("\nEnter Here the Above otp: ");
			int uo=s.nextInt();
			if(otp==uo)
				System.err.println("\n\t******Verification done****\n\n--->You Loan amount is Credited within 5 business day in to your account");
			else
				System.err.println("\n\t*******Wrong otp*******");
			
		}else
		{
			System.err.println("\n\t*******You Crossed limit*******");
		}
	}
}
