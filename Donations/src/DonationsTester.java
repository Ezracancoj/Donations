import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DonationsTester {
	public static void main(String[] args) throws FileNotFoundException {
		Donations giveToMe = new Donations();
		
		File donFile = new File("Donations.txt"); 
		
		Scanner openFile = new Scanner(donFile);
		
		Scanner start = new Scanner(System.in);
		
		String userInput; 
		
		String cat = "";
		
		
		System.out.println("Would you like to process donations now?(enter 'Yes' to continue): "); 
		userInput = start.nextLine();
	

		if(userInput.equals("Yes")){
			while (openFile.hasNextLine()) { 
				String donation = openFile.nextLine(); 
				String nums = donation.replaceAll("[^0-9,^-]",""); 

				double numsDouble = Double.parseDouble(nums);
		
				//System.out.println(donation); 
				//System.out.println(numsDouble);
				
				if (donation.startsWith("<individual")){ 
					cat = "individual";
					}
					
				if (donation.startsWith("<business")){ 
					cat = "business";
					}
					
				if (donation.startsWith("<other")){ 
					cat = "other";
					}
				
				if (donation.startsWith("<EOF")){ 
				 	break;
				 	}
				
				giveToMe.processDonation(cat, numsDouble);
				   
					}
			
			

			giveToMe.getStatistics();
					
		

		}
		
		else {
			System.out.println("Ending now without processing donations");
		}
		
			
		
		
openFile.close();
start.close();		
}
}


