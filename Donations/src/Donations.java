public class Donations {
	int numIndividual;
	int amtIndividual;
	int numBusiness;
	int amtBusiness;
	int numOther;
	int amtOther;

	public void processDonation(String cat,double nums){
		if(cat.equals("EOF")) {
			;
		}
		
		if(cat.equals("individual") && nums > 0){ 
			numIndividual = numIndividual + 1;
			amtIndividual += nums;
		}
			
		if(cat.equals("individual") && nums < 0){ 
			numIndividual = numIndividual - 1;
			amtIndividual += nums;
			  
		}
		
		if(cat.equals("business") && nums > 0){ 
			numBusiness = numBusiness + 1;
			amtBusiness += nums;
		}
			
		if(cat.equals("business") && nums < 0){ 
			numBusiness = numBusiness - 1;
			amtBusiness += nums;
			  
		}
		
		if(cat.equals("other") && nums > 0){ 
			numOther = numOther + 1;
			amtOther += nums;
		}
			
		if(cat.equals("other") && nums < 0){ 
			numOther = numOther - 1;
			amtOther += nums;
			  
		}
	}
		
		
		

			 
		
	
	public void getStatistics() {
		System.out.println("Individual: #:"+numIndividual+" $"+amtIndividual);
		System.out.println("Business: #:"+numBusiness+" $"+amtBusiness);
		System.out.println("Other: #:"+numOther+" $"+amtOther);
	}


		
	}
