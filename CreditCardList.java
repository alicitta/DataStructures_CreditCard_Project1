/******************* Program Identification ************************************************/
/* COURSE: CS 380 Data Structures 				                           */
/* PROJECT # : 	Project #1				                  		   */
/* DUE DATE :	2/3/16						                           */
/* SOURCE FILE :  CreditCardList.java            			                   */
/* Instructor: Dr. Samuel Sambasivam                                                       */
/*                                                                                         */
/* Student Name: Ali Citta                                                                 */
/* *****************************************************************************************/

public class CreditCardList 
{
	private static final int max_size = 100;
	private int size;
	private int cursor;
	private CreditCard [] cardList;
	
	//Set up method
	private void setup(int number)
	{
		cardList = new CreditCard [number];
		size = 0;
		cursor = -1;
	}
	
	//Constructors
	public CreditCardList()
	{
		setup(max_size);
	}
	
	public CreditCardList(int maxNumber)
	{
		setup(maxNumber);
	}
	
	//Method to check if list is empty
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	//Method to check if list is full
	public boolean isFull()
	{
		return size >= cardList.length;
	}
	
	//Method to show what is currently in the list and the structure
	public void showStructure()
	{
		if(isEmpty())
			System.out.println("Empty List");
		else
		{
			System.out.println("Size = " + size + " Cursor = " + cursor);
			System.out.println();
			
			for(int index = 0; index < size; index++)
			{
				System.out.println("(" + cardList[index].getName() + "," + cardList[index].getBalance() + ")");
				System.out.println();
			}
		}
	}
	
	//Method to add a card to a list
	public void append(CreditCard newCard)
	{
		if(isFull())
		{
			System.out.println("List is full");
			return;
		}
		else
		{
			cursor = size++;
			cardList[cursor] = newCard;
			System.out.println("Credit Card has been added.");
		}
	}
	
	//Method to clear the list
	public void clear()
	{
		size = 0;
		cursor = -1;
		
		System.out.println("The list has been cleared.");
	}
	
	//Method to point cursor to the beginning of the list
	public boolean goToBeginning()
	{
		if(!isEmpty())
		{
			cursor = 0;
			System.out.println("Cursor has moved to the beginning of the list.");
			return true;
		}
		else
		{
			System.out.println("Empty List.");
			return false;
		}
	}
	
	//Method to point cursor to the end of the list
	public boolean goToEnd()
	{
		if(!isEmpty())
		{
			cursor = size - 1;
			System.out.println("Cursor has moved to the end of the list.");
			return true;
		}
		else
		{
			System.out.println("Empty List.");
			return false;
		}
	}
	
	//Method to point cursor to the next card in list
	public boolean goToNext()
	{
		if(!isEmpty())
		{
			if(cursor == size - 1)
			{
				System.out.println("Cursor is at the end of the list.");
				return false;
			}
			else
			{
				cursor++;
				System.out.println("Cursor has moved to the next card.");
				return true;
			}	
		}
		else
		{
			System.out.println("Empty List.");
			return false;
		}
	}
	
	//Method to point cursor to the previous card in the list
	public boolean goToPrior()
	{
		if(!isEmpty())
		{
			if(cursor != 0)
			{
				cursor--;
				System.out.println("Cursor has moved to the previous card.");
				return true;
			}
			else
			{
				System.out.println("Cursor is at the beginning of the list.");
				return false;
			}
			
		}
		else
		{
			System.out.println("Empty List.");
			return false;
		}
	}
	
	//Method to find where the cursor is
	public CreditCard getCursor()
	{
		if(!isEmpty())
		{
			if(!isFull())
			{
				System.out.println(cardList[cursor]);
				return cardList[cursor];
			}
			return cardList[cursor - 1];
		}
		else
		{
			System.out.println("Empty List.");
			return null;
		}
		
	}
	
	//Method to insert a card in the beginning of the list
	public void insertBeginning(CreditCard newCard)
	{
		if(!isFull())
		{
			if(!isEmpty())
			{
				for(int index = size - 1; index >= 0; index--)
				{
					cardList[index + 1] = cardList[index];
				}
			}
			size++;
			cardList[0] = newCard;
			cursor = 0;
			System.out.println("New card has been added to the beginning of the list.");
		}
		else
		{
			System.out.println("List is full.");
		}
	}
	
	//Method to insert a card where the cursor is 
	public boolean insert(String name, double balance)   //Received help from Jesse
	{
		if(!isFull())
		{
			for(int index = 0; index < size; index++)
			{
				cursor = index;
				if(name == cardList[index].getName())
				{
					System.out.println("Name is already in the list.");
					return false;
				}	
			}
			for(int index = size - 1; index >= cursor; index--)
			{
				cardList[index + 1] = cardList[index];
			}
			CreditCard newCard = new CreditCard(name, balance);
			cardList[cursor] = newCard;
			
			System.out.println("Card has been inserted into the list.");
			
			cursor++;
			size++;
			return true;
		}
		else
		{
			System.out.println("Empty List.");
			return false;
		}
	}
	
	//Method to update the balance of a card in a list
	public boolean update(String name, double balance)
	{
		if(!isEmpty())
		{
			for(int index = 0; index < size; index++)
			{
				if(name == cardList[index].getName())
				{
					cardList[index].setBalance(balance);
					System.out.println("Card has been updated.");
					return true;
				}
			}
			System.out.println("That name is not in this list.");
			return false;
		}
		System.out.println("Empty list.");
		return false;
	}
	
	//Method to erase a card in the list
	public boolean erase(String name, double balance)	//Received help from Jesse
	{
		if(!isEmpty())
		{
			for(int index = 0; index < size; index++)
			{
				if(name == cardList[index].getName())
				{
					for(int newIndex = index; newIndex < size - 1; newIndex++)
					{
						cardList[newIndex] = cardList[newIndex + 1];
					}
					size--;
					cursor--;
					System.out.println("Credit Card has been erased.");
					return true;
				}
			}
			System.out.println("That name is not in this list.");
			return false;
		}
		System.out.println("Empty List.");
		return false;
	}
	
	//Method to see if a person's card is in the list
	public boolean contains(String name, double balance)
	{
		for(int index = 0; index < size; index++)
		{
			if(name == cardList[index].getName())
			{
				System.out.println("Name is in list.");
				return true;
			}
		}
		System.out.println("Name is not in list.");
		return false;
	}
	
	//Accessor method to get a Credit Card
	public CreditCard get(String name)
	{
		for(int index = 0; index < size; index++)
		{
			if(name == cardList[index].getName())
			{
				System.out.println(cardList[index]);
				return cardList[index];
			}
		}
		System.out.println("Name is not in list.");
		return null;
	}
}
