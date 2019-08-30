package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Read in itemCount to process
		int itemCount = scan.nextInt();
		
		// Create arrays to store itemName,itemPrice
		String[] itemName = new String[itemCount];
		Double[] itemPrice = new Double[itemCount];
		
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
		Double [] customerTotal = new Double[customerCount];
		Double sum = 0.0;
		
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
				
		// Compare customerItemName with itemName to find itemPrice
				for (int z=0; z<itemCount; z++) {
					if (customerItemName[j].equals(itemName[z])) {
						
						// Calculate total price of customerItems
						sum = sum + customerItemQuantity[j]*itemPrice[z];
						break;
					}			
				}
			}
			customerTotal[i]= sum;
			sum = 0.0;
		}	
		
		// All input parsed, so close scanner
		scan.close();
		
		// Print biggest price
		Double cur_max = 0.0;
		int m = 0;
		for (int i=0; i < customerTotal.length; i++) {
			if (customerTotal[i] > cur_max) {
				cur_max = customerTotal[i];
				m = i;
			}
		}
		System.out.println("Biggest: "+customerFirstName[m]+" "+customerLastName[m]+" ("+String.format("%.2f", cur_max)+")");
		
		// Print smallest price
		Double cur_min = customerTotal[0];
		int n = 0;
		for (int i=1; i < customerTotal.length; i++) {
			if (customerTotal[i] < cur_min) {
				cur_min = customerTotal[i];
				n = i;
			}
		}
		System.out.println("Smallest: "+customerFirstName[n]+" "+customerLastName[n]+" ("+String.format("%.2f", cur_min)+")");
				
		// Print average price
		Double total = calculateValueSum(customerTotal);
		Double average = ((double) total)/((double)customerCount);
		System.out.println("Average: "+String.format("%.2f", average));
    }
	
	static Double calculateValueSum(Double[] vals) {
		
		Double sum = 0.0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	
}

