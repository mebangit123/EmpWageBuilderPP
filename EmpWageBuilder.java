public class EmpWageBuilder {
	public static final int is_FullTime = 1;
	public static final int is_PartTime = 2;
	//public static final int EMP_RATE_PER_HOUR = 20;
	//public static final int NUM_OF_WORKING_DAYS = 2;
	//public static final int MAX_HRS_IN_MONTH = 10;

public static void calcEmpWage(String company,int empRatePerHr, int numOfDays, int maxHourInMonth) {

	int empHrs = 0;
	int totalWorkingDays = 0;
	int totalEmpHrs = 0;
	int totalEmpWage = 0;

	while( totalEmpHrs < maxHourInMonth & totalWorkingDays < numOfDays) {
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
				case is_FullTime:
					empHrs = 8;
					break;
				case is_PartTime:
					empHrs = 4;
					break;
				default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hour: " + empHrs);
	}
		System.out.println("Total Emp Hours :" + totalEmpHrs);
		totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println("Total Emp Wage for Company: "+company+" is :" + totalEmpWage);
}

public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		calcEmpWage("Dmart",20,2,10);
	}
}
