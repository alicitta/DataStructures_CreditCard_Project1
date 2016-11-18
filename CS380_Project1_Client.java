/******************* Program Identification ************************************************/
/* COURSE: CS 380		Data Structures 				                   */
/* PROJECT # : 	Project #1			                   			        */
/* DUE DATE :	2/3/16								        */
/* SOURCE FILE :  CS380_Project1_Client.java            				                    */
/* Instructor: Dr. Samuel Sambasivam                                                                       */
/*                                                                                                                                  */
/* Student Name:  Ali Citta                                                                                                      */
/* Student ID: 002-47-7431									        */
/* ********************************************************************************************/

/**************** Program Description ****************************************************/
/* Program adds credit cards to a list and then alter the list with a series of methods created in
   in the CreditCardList.java and CreditCard.java classes */
/* *******************************************************************************************/

public class CS380_Project1_Client
{
	public static void main(String[] args) 
	{
		heading();
		
		//Creating Credit Card List
		CreditCardList myList = new CreditCardList(9);
		
		//Creating Credit Cards
		CreditCard Card1 = new CreditCard("Ali", 525.90);
		CreditCard Card2 = new CreditCard("Monica", 25353.94);
		CreditCard Card3 = new CreditCard("Harry", 12.45);
		CreditCard Card4 = new CreditCard("Richard", 1943.33);
		CreditCard Card5 = new CreditCard("Sarah", 134.45);
		CreditCard Card6 = new CreditCard("Jeremy", 7892.55);
		
		//Adding Cards to List
		myList.append(Card1);
		myList.append(Card2);
		myList.append(Card3);
		myList.append(Card4);
		myList.append(Card5);
		myList.showStructure();
		System.out.println();
		
		myList.goToNext();
		myList.showStructure();
		System.out.println();
		
		//Testing methods from CreditCardList.java
		myList.insertBeginning(Card6);
		myList.showStructure();
		System.out.println();
		
		myList.goToEnd();
		myList.showStructure();
		System.out.println();
		
		myList.goToPrior();
		myList.showStructure();
		System.out.println();
		
		myList.getCursor();
		myList.showStructure();
		System.out.println();
		
		myList.insert("Carol", 29483.99);
		myList.showStructure();
		System.out.println();
		
		myList.update("Harry", 5893.87);
		myList.showStructure();
		System.out.println();
		
		myList.erase("Jeremy", 7892.55);
		myList.showStructure();
		System.out.println();
		
		myList.contains("Monica", 25353.94);
		myList.showStructure();
		System.out.println();
		
		myList.get("Richard");
		myList.showStructure();
		System.out.println();
		
		myList.clear();
		myList.showStructure();
		System.out.println();
		
		myList.append(Card2);
		myList.showStructure();
		
		footing();
		return;
	}

	/*			FUNCTION HEADING	 	                              */
	/***********************************************************************************/
	public static void heading()
	  { 
	    System.out.println();
	    System.out.println("Ali Citta     CS 380  ");
	    System.out.println("Spring 2016   Project # 1");
	    System.out.println();
	    System.out.println();
	    return;
	  } 
	/**************************************************************************************/    

	/***********************************************************************************/
	/*			FUNCTION FOOTING	 	                              */
	/***********************************************************************************/
	public static void footing()
	  {
	    System.out.println ();
	    System.out.println ();
	    System.out.println ( "END OF OUTPUT");
	    System.out.println ();
	    return;
	  }
	/*********************************************************************************/

}
