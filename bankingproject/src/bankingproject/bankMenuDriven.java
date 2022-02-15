package bankingproject;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class bankMenuDriven {
	String pin;
	String validpin;
	HashMap <String,bankappClass> map= new HashMap<>();
	Scanner sc=new Scanner(System.in);

	public void pincreation()
	{
	  String pin;
	  
	  int i=0;
	 
	System.out.println("create pin for further operation");
do {
		
		System.out.println("Enter your pin");
		pin=sc.next();
		
		if(pin.length()==4)
		do
		{
			pin=bankappClass.setPin(pin);
			char[] ch=pin.toCharArray();
			
			{
			if(ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||
						ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='0'	)
				{	System.out.println("----------------------------------------------");
					System.out.println("Your Pin  Created");
					System.out.println("----------------------------------------------");
				}
			
			else
			System.out.println("Invalid Pin!!! pin should be numbers");
			
			}}while(pin.length()==4 && pin.charAt(i)>=0 && pin.charAt(i)<=9);
		    	
		else
			
			{
				System.out.println("Enter 4 digits as pin");
			}
	
		
		}while(pin.length()!=4 );
	
	}
			
public void operation()
{
	int option;
	char choice;
	bankRecords obj=new bankRecords();
	

	do {
	System.out.println("3. Check Balance");
	System.out.println("4. Withdraw");
	System.out.println("5. Deposit");
    System.out.println("6. Previous Transaction");
    System.out.println("7. Fund Transaction");
	System.out.println("8. Exit");
	System.out.println("Enter the Option");
	option=sc.nextInt();
	switch(option)
	{
	case 3:
		obj.viewbalance();
		break;
	case 4:
		obj.withdraw();
		break;
	case 5:
		obj.deposit();
		break;
	case 6:
		obj.previous_transaction();
		break;
	case 7:
		obj.transfer();
		break;
	case 8:
		obj.exit();
		break;
	}
		System.out.println("Do you want to perform more operation? (Y/N)");
		choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');	
}
public int randommethod()
{
	int max=15;
	int min=1;
	int range=max-min+1;
	int random=(int)((Math.random()*100000000)*range)+min;
    int Acc_no= bankappClass.setAcc_no(random);
	
	return random ;
	
}

}


