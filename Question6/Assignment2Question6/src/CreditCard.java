import java.time.LocalDate;
import java.util.*;

public class CreditCard {

	private final double universalCredit = 2000;
	private double balance = universalCredit ;
	private String accountNumber;
	private int rewardPoints;
	private double expenses;
	private double payments;
	private double interestDue;
	private LocalDate dueDate;
	
	//constructor of the credit card
	public CreditCard(String a)
	{
		this.balance = universalCredit; 
		this.accountNumber = a;
		this.rewardPoints = 0;
		this.dueDate = LocalDate.now().plusMonths(1);
	}
	
	//operations
	private void Charge(double amount)
	{
		if(this.balance >= amount)
		{
			this.balance -= amount;
			this.expenses += amount;
			this.rewardPoints += (amount * 0.1);
		}
		else
		{
			System.out.println("You cannot make this purchase, it's over your limit");
		}
	}
	
	private void MakePayment(double amount)
	{
		if(LocalDate.now() <= this.dueDate)
		{
			this.balance += amount;
			this.payments += amount;
		}
		else
		{
			this.balance -= chargeInterest(universalCredit - balance);
			this.balance += amount;
			this.payments += amount;
		}
	}
	
	private double ChargeInterest(double amount)
	{
		this.interestDue += (0.20 * amount);
	}
	
	private void DisplayStatistics()
	{
		System.out.println("Stats for the account number: " + this.accountNumber);
		System.out.println("Your overall Balance:" + this.balance);
		System.out.println("Your overall reward points:" + this.rewardPoints);
		System.out.println("Your overall payments:" + this.payments);
		System.out.println("Your overall expenses:" + this.expenses);
	}
	
	private void ValidateAccount(String account)
	{
		account.
	}
	
	private static void main(String[] args)
	{
		System.out.println("Hello and welcome to the Sample Bank, let's create an account");
		System.out.println("Enter your account Number");
		
		Scanner keyboard = new Scaner();
		String account = keyboard.nextLine()
		CreditCard customer = new CreditCard(account);
		System.out.println("Enter you");
		
		
	}
}

