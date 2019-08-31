package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Read in itemCount to process
				int itemCount = scan.nextInt();
				
				// Create arrays to store itemName,itemPrice
				String[] itemName = new String[itemCount];
				Double[] itemPrice = new Double[itemCount];
				int [] countItem = new int[itemCount];
				int [] countItemCustomer = new int[itemCount];
				
				// Read values into the arrays of items
				for(int i=0; i<itemCount; i++) {
					itemName[i] = scan.next();
					itemPrice[i] = scan.nextDouble();
				}
				
				// Read in customerCount to process 
				int customerCount = scan.nextInt();
				
				/* Create arrays to store customerFirstName,customerLastName,
				 * customerItemNumber,customerTotal
				 */
				String[] customerFirstName = new String[customerCount];
				String[] customerLastName = new String[customerCount];
				int [] customerItemNumber = new int[customerCount];
				
				// Read values into the arrays of customers
				for (int i=0; i<customerCount; i++) {
					customerFirstName[i] = scan.next();
					customerLastName[i] = scan.next();
					customerItemNumber[i] = scan.nextInt();
							
				// Create arrays to store customerItemQuantity,customerItemName
					int [] customerItemQuantity = new int[customerItemNumber[i]];
					String [] customerItemName = new String[customerItemNumber[i]];
							
				// Read values into the arrays of customerItems
					for (int j=0; j<customerItemNumber[i]; j++) {
						customerItemQuantity[j] = scan.nextInt();
						customerItemName[j] = scan.next();
						
				// Compare customerItemName with itemName to countItem, countItemCustomer
						for (int z=0; z<itemCount; z++) {
							if (customerItemName[j].equals(itemName[z])) {
								
								// Calculate total price of customerItems
								countItem[z] = countItem[z]+customerItemQuantity[j];
								countItemCustomer[z] = countItemCustomer[z]+1;
								
							}			
						}
					}
					
				}	
				
				// All input parsed, so close scanner
				scan.close();
				
				// Print result
				for (int i=0; i<itemCount; i++) {
					if (countItemCustomer[i] == 0) {
						System.out.println("No customers "+"bought "+itemName[i]);
					}
					else {
						System.out.println(countItemCustomer[i]+" customers "+"bought "+countItem[i]+" "+itemName[i]);
					}
				}
			
		
	}
}
