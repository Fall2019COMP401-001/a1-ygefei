package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers to process
				int count = scan.nextInt();
				
				
				// Create arrays to store firstName,lastName,item.
				
				String[] firstName = new String[count];
				String[] lastName = new String[count];
				int [] itemNumber = new int[count];	
				Double [] total = new Double[count];
				Double sum = 0.0;
						
				// Read values into the arrays
				
				for (int i=0; i<count; i++) {
					firstName[i] = scan.next();
					lastName[i] = scan.next();
					itemNumber[i] = scan.nextInt();
					
				// Create arrays to store itemQuantity,itemName,itemPrice
					int [] itemQuantity = new int[itemNumber[i]];
					String [] itemName = new String[itemNumber[i]];
					Double [] itemPrice = new Double[itemNumber[i]];
					
				// Read values into the array
					for (int j=0; j<itemNumber[i]; j++) {
					itemQuantity[j] = scan.nextInt();
					itemName[j] = scan.next();
					itemPrice[j] = scan.nextDouble();
				
				// Calculate price of whole item
					sum=sum+itemQuantity[j]*itemPrice[j];
					}
					total[i]= sum;
					sum = 0.0;
				}
				
				// All input parsed, so close scanner
				scan.close();
			
				// Print consumer's information
				for (int i=0; i<count; i++) {
					System.out.println(firstName[i].charAt(0)+". "+lastName[i]+": "+String.format("%.2f", total[i]));
				}
		
	}
}
