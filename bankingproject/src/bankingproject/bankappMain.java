package bankingproject;

import java.util.Scanner;


public class bankappMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		bankRecords obj=new bankRecords();
		int option;
		char choice;
		
		System.out.println("Enter your Bank Name");
		String b_name=sc.nextLine();
		System.out.println("--------------------------------------");
		
		System.out.println("Welcome to "+b_name );
		
		System.out.println("--------------------------------------");
		do
		{
			System.out.println("1. Login");
			System.out.println("2. Registration");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				obj.login();
				break;
			case 2:
				obj.registration();
				break;
			
			
			}
		System.out.println("Do you want to perform more operation? (Y/N)");
		choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');
	}

}

