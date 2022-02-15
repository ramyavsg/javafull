package bankingproject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class bankRecords extends bankMenuDriven {
	 
		HashMap <String,bankappClass> map= new HashMap<>();
		Scanner sc=new Scanner(System.in);
		bankappClass b1=new bankappClass();
		bankMenuDriven bank=new bankMenuDriven();
		double balance;
		int amount;
		String pin;
		String name;
		int flag;
		int Acc_no;
		void login()
		{
			
			System.out.println("Enter User Name");
			 String name=b1.setName(sc.next().toString());
			System.out.println("Enter User_id");
			String User_id=sc.next();
			System.out.println("Enter Password");
			String password=sc.next();
			
			int flag=0;
			for(Entry<String, bankappClass> i:map.entrySet())
			{
				
					if(i.getValue().getUser_id().equals(User_id) && i.getValue().getPassword().equals(password))
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					
						System.out.println("Invalid UserId and Password");
				}
				else
						{
					bank.pincreation();
					System.out.println("-----------------------------------------");
					System.out.println("*********Welcome " +name +"*********");
					bank.randommethod();
					System.out.println("*********Account No " +bankappClass.getAcc_no() +"*********");
					
					System.out.println("-----------------------------------------");
					if(flag==1)
						bank.operation();
					    
						}
				
				         
				
				}
				

		void registration()
		{
			System.out.println("Enter User Name");
			 String name=sc.next();
			System.out.println("Enter User_id");
			String User_id=sc.next();
			System.out.println("Enter Password");
			String password=sc.next();
			
			
			int flag=0;
			for(Entry<String, bankappClass> i:map.entrySet())
			{
				if(i.getValue().getUser_id().equals(User_id));
				flag=1;
				break;
			}
			if (flag==0)
			{
				map.put(User_id,new bankappClass(User_id,password,Acc_no,name));
				
			    System.out.println("----------------------------------------------");
				System.out.println("Registered Successfully");
				
				System.out.println("----------------------------------------------");
			}
			else
			{
				System.out.println("User Id already exist");
			}
			
				}

							
		void viewbalance ()
		{

			System.out.println("Enter pin for transaction");
			String Validpin=sc.next();
			if(Validpin.equals(bankappClass.getPin()))
				System.out.println("Curent Balance " +balance);
			else
			
			System.out.println("Invalid pin");
			}

			
		void withdraw()
		{
			System.out.println("Enter pin for transaction");
			String Validpin=sc.next();
			if(Validpin.equals(bankappClass.getPin()))
			{
				System.out.println("Enter the Amount");
			 amount=sc.nextInt();
			 if(balance>0)
			 {
			 balance=balance-amount;
			 System.out.println(" Balance after Withdraw " +balance);
			 }
			 else
			 {
				 System.out.println("Invalid Transaction!Insufficient balance");
			 }
			}
			else
				
				System.out.println("Invalid pin");
				 
		}
		void deposit()
		{
			System.out.println("Enter pin for transaction");
			String Validpin=sc.next();
			if(Validpin.equals(bankappClass.getPin()))
			{
			System.out.println("Enter the Amount");
			amount=sc.nextInt();
				balance=balance+amount;
			System.out.println("Balance after Deposit " +balance);	
			}	

		else
			
			System.out.println("Invalid pin");
		}

		void previous_transaction()
		{
			System.out.println("Enter pin for transaction");
			String Validpin=sc.next();
			if(Validpin.equals(bankappClass.getPin()))
			{
			
		     Acc_no=bankappClass.getAcc_no();
			 System.out.println(" Name of Account Holder   "+ Acc_no);
			 LocalDate date= LocalDate.now();
			 System.out.println("Date:  "+date);
			 LocalTime localTime =LocalTime.now();
			 System.out.println("Time :  " +localTime);
			 System.out.println("previous transaction   " +balance );
			}
			 else
					
					System.out.println("Invalid pin");
			}	

		void transfer()

		{
			System.out.println("Enter pin for transaction");
			String Validpin=sc.next();
			if(Validpin.equals(bankappClass.getPin()))
			{
				 bank.randommethod();
					int acc_no=bankappClass.getAcc_no();   
				System.out.println("Enter the account no to transfer "+acc_no );
				   
					System.out.println("Enter the Amount");
					 amount=sc.nextInt();
					 if(balance>0)
					 {
					 balance=balance-amount;
					 System.out.println(" Balance after Transfer " +balance);
					 }
					 else
					 {
						 System.out.println("Insufficient balance for Transaction");
					 }
			}
			 else
					
					System.out.println("Invalid pin");
			}
			

		void exit()
		{
			System.out.println("----------------------------------------------");
			
			System.out.println("Thank You, Visit Again!");
			
			System.out.println("----------------------------------------------");
			System.exit(0);
		}

		}


