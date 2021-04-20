public class EmpWageBuilder {
	public static final int is_FullTime = 1;
	public static final int is_PartTime = 2;

	private final String company;
	private final int numOfDays;
	private final int empRatePerHr;
	private final int maxHourInMonth;
	private int totalEmpWage;

public EmpWageBuilder(String company,int empRatePerHr, int numOfDays, int maxHourInMonth) {

	this.company = company;
	this.numOfDays = numOfDays;
	this.empRatePerHr = empRatePerHr;
	this.maxHourInMonth = maxHourInMonth;
}

public void computeEmpWage(){

	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
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
}

@Override
public String toString() {
	return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
}

public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		EmpWageBuilder dMart = new EmpWageBuilder("Dmart",20,2,10);
		EmpWageBuilder reLiance = new EmpWageBuilder("Reliance",20,4,10);

		dMart.computeEmpWage();
		System.out.println(dMart);

		System.out.println("--------------------------");

		reLiance.computeEmpWage();
		System.out.println(reLiance);
	}
}
