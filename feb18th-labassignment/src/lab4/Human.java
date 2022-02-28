package lab4;

 class Person {
	private long accNum;
	private double balance=500;
	public Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double i) {
		this.balance=this.balance+i;
		
	}
	public void withdraw(double i) {
		if(i<=this.balance) {
			this.balance=this.balance-i;
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}
	public double getBalance() {
		return this.balance;
	}

}

public class Human{
	String name;
	float age;
	public static void main(String[] args) {
		Person smith=new Person();
		smith.deposit(2000);
		smith.setAccHolder(smith);
		smith.setAccNum(12345);
		
		Person kathy=new Person();
		kathy.deposit(3000);
		kathy.setAccHolder(kathy);
		kathy.setAccNum(56789);
		
		smith.deposit(2000);
	
		kathy.withdraw(2000);
		System.out.println(smith.getBalance());
		System.out.println(kathy.getBalance());
		
		
		
	}
	
}
