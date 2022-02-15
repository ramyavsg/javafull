package bankingproject;



public class bankappClass {
	String User_id;
	String password;
	static int Acc_no;
	 String name;
	String Acc_type;
	static Double balance=0.0;
	static int amount;
	 static String pin;




	public bankappClass(String user_id, String password, int acc_no, String name) {
		super();
		User_id = user_id;
		this.password = password;
		Acc_no = acc_no;
		this.name = name;
	}


	public bankappClass(String user_id, String password, int acc_no, String name,String pin) {
		super();
		User_id = user_id;
		this.password = password;
		Acc_no = acc_no;
		this.name = name;
		pin=pin;
	}

	public bankappClass() {
		super();
	}


	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static int getAcc_no() {
		return Acc_no;
	}
	public static int setAcc_no(int acc_no) {
		return Acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public String getAcc_type() {
		return Acc_type;
	}
	public void setAcc_type(String acc_type) {
		Acc_type = acc_type;
	}
	public static Double getBalance() {
		return balance;
	}
	public static void setBalance(Double balance) {
		bankappClass.balance = balance;
	}
	public static int getAmount() {
		return amount;
	}
	public static void setAmount(int amount) {
		bankappClass.amount = amount;
	}

	public static String getPin() {
		return pin;
	}

	public static String setPin(String pin) {
		return bankappClass.pin = pin;
	}

	@Override
	public String toString() {
		return "bankappClass [User_id=" + User_id + ", password=" + password + ", Acc_no=" + Acc_no + ", name=" + name
				+ ", Acc_type=" + Acc_type + ", pin=" + pin + "]";
	}

	}

