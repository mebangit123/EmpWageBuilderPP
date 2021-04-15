public class EmpWageBuilder {
	public static final int is_FullTime = 1;
	public static final int is_PartTime = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;

public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;

		while( totalEmpHrs < MAX_HRS_IN_MONTH & totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}
