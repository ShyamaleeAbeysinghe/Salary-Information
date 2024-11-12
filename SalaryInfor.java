
import java.util.*;
class SalaryInfor{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
	double tax,bonus,x,y;
	double difference=0;
	double monthlyInstallement,loanAmount,r=0.15;
	int n;
	tax=0;
		
	System.out.println("--------------------------------------------------------");	
	System.out.println("|               SALARY INFORMATION SYSTEM              |");
	System.out.println("--------------------------------------------------------");
	System.out.println();
	System.out.println("         [1] Calculate Income Tax                       ");
	System.out.println("         [2] Calculate Annual Bones                     ");
	System.out.println("         [3] Calculate Loan amount                      ");
	System.out.println();
	System.out.print("Entre an option to continue > ");
	double option=input.nextDouble();
	if(option==1){
	System.out.println();
	System.out.println("-------------------------------------------------------");
	System.out.println("|             Calculate Income Tax                     |");
	System.out.println("-------------------------------------------------------");
	System.out.println();
	System.out.print("Input Employee name - ");
	String name=input.next();
	
	System.out.print("Input Employee salary - ");
	double salary=input.nextDouble();
	System.out.println();
  	if(salary<=100000){
	System.out.println("You have to pay Income Tax per month: "+tax);
	}
	if(salary>100000){ //6%
		if(salary>=141667){
			difference=41667;
		}else{
			difference=salary-100000;
		}
	
		tax+=(difference*6)/100;
 	}
	if(salary>141667){ //12%
		if(salary>=183333){
			difference=41667;
		}else{
			difference=salary-141667;
		}
	
		tax+=(difference*12)/100;
 	}
	if(salary>183333){//18%
		if(salary>=225000){
			difference=41667;
		}else{
			difference=salary-183333;
		}
	
		tax+=(difference*18)/100;
	}
	if(salary>225000){//24
 		if(salary>=266667){
			difference=41667;
		}else{
			difference=salary-225000;
		}
		tax+=(difference*24)/100;
	}
	if(salary>266667){//30
		if(salary>=308333){
			difference=41667;
		}else{
			difference=salary-266667;
		}
		tax+=(difference*30)/100;
	}
	if(salary>308333){
		difference=salary-308333;
		tax+=(difference*36)/100;
	}

	System.out.println("You have to pay Income Tax per month: "+tax);

}
	else if(option==2){
	System.out.println();
	System.out.println("-------------------------------------------------------");
	System.out.println("|             Calculate Annual Bonus                  |");
	System.out.println("-------------------------------------------------------");
	System.out.println();
	System.out.print("Input Employee name - ");
	String name=input.next();
	
	System.out.print("Input Employee salary - ");
	double salary=input.nextDouble();
	System.out.println();
	if(salary<=100000){
	bonus=5000;
	System.out.println("Annual bonus  - "+bonus);
	}
	else if(salary>100000 && salary<=199999){
	bonus=(salary*10)/100;
	System.out.println("Annual bonus  - "+bonus);
	}
	else if(salary>=200000 && salary<=299999){
	bonus=(salary*15)/100;
	System.out.println("Annual bonus  - "+bonus);
	}
	else if(salary>=300000 && salary<=399999){
	bonus=(salary*20)/100;
	System.out.println("Annual bonus  - "+bonus);
	}
	else{
	bonus=(salary*35)/100;
	System.out.println("Annual bonus  - "+bonus);
	}
	
}
	else if(option==3){
	System.out.println();
	System.out.println("-------------------------------------------------------");
	System.out.println("|            Calculate loan amount                    |");
	System.out.println("-------------------------------------------------------");
	System.out.println();
	System.out.print("Input Employee name - ");
	String name=input.next();
	
	System.out.print("Input Employee salary - ");
	double salary=input.nextDouble();
	System.out.println();

	
	if(salary>50000){
	
	System.out.print("Enter number of year  - ");
	int year=input.nextInt();
		if(year<=20){
			monthlyInstallement=(salary*60)/100;
		   
			n=year*12;                                
			x=Math.pow(1+(r/12),n);
			y=(r/12);
		
			loanAmount=monthlyInstallement*(1-(1/(x)))/y;
			System.out.println("You can get loan Amount : "+Math.round(loanAmount/1000)*1000);

		}else{
			System.out.println(" Maximum year can't be greater than 5 ");
		}
	
			
	}else{
		System.out.println("           You can not get a loan beacuse your salary lessthan Rs.50000...");
	
	}

}




}
}
