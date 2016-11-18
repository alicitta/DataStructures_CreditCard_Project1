/******************* Program Identification ************************************************/
/* COURSE: CS 380 Data Structures 				                           */
/* PROJECT # : Project #1 				                                   */
/* DUE DATE : 2/3/16	              					                   */
/* SOURCE FILE :  CreditCard.java            				                   */
/* Instructor: Dr. Samuel Sambasivam                                                       */
/*                                                                                         */
/* Student Name: Ali Citta                                                                 */
/* *****************************************************************************************/


public class CreditCard 
{
	private String name;
	private double balance;
	
	//Constructors
	public CreditCard()
	{
		name = "";
		balance = 0.0;
	}
	
	public CreditCard(String name, double balance)
	{
		this.name = name;
		this.balance = balance;
	}

	//Accessors (getters)
	public String getName() 
	{
		return name;
	}
	
	public double getBalance() 
	{
		return balance;
	}

	//Mutator (setters)
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	//ToString Method
	public String toString() 
	{
		return "CreditCard [name = " + name + ", balance = " + balance + "]";
	}
}
