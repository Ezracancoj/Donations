import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Donations {

	public static void main(String[] args) throws FileNotFoundException {
		String userInPut;
		int numIndividual;
		//The number of individual donations
		int amtIndividual;
		//The total of all individual donations
		int numBusiness;
		//The number of business donations
		int amtBusiness;
		//The total of all business donations
		int numOther;
		//The number of other donations
		int amtOther;
		//The total of all other donations
		
		
		Scanner start = new Scanner(System.in);
		
		System.out.println("Would you like to process donations now?(enter 'Yes' to continue): ");
		userInPut = start.nextLine();
		if((userInPut).equals("Yes")) {
			processData();
		}
		else {
			System.out.println("Ending now without processing donations");
		}
		
		start.close();
/*		
	String.replaceAll
		*/
		
		
	}

	private static void processData()throws FileNotFoundException {
		File donFile = new File("Donations.txt");
		Scanner openFile = new Scanner(donFile);
		String donation = openFile.nextLine();
		if (donation.startsWith("<individual"));{
			String nums = donation.replaceAll("[^0-9,^-]","");
			System.out.println(nums);
			double numsDouble = Double.parseDouble(nums);
			System.out.println(numsDouble);
		}
		
		openFile.close();
	}
	
}