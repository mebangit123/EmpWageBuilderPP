public class EmpWageBuilder {
	public static final int is_FullTime = 1;
	public static final int is_PartTime = 2;

	public static void calculateWage(final Company company) {
		int totalEmpHours = 0;
		int empHours = 0;
		int totalWorkingDays = 0;

		while (totalEmpHours <= company.getMaxHrsInMonth() 
			&& totalWorkingDays <= company.getNoOfWorkingDays()) {

			totalWorkingDays++;

			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;

			switch (empCheck) {
				case is_FullTime:
					empHours = 8;
					System.out.println("Employee is present full-time on day " + totalWorkingDays);
				break;
				case is_PartTime:
					empHours = 4;
					System.out.println("Employee is present part-time on day " + totalWorkingDays);
				break;
				default:
					empHours = 0;
					System.out.println("Employee is abscent on day " + totalWorkingDays);
			}
			totalEmpHours += empHours;
			System.out.println("Day# : "+totalWorkingDays+ " Emp hrs : " +  empHours);
			
		}
		int totalEmpWage = totalEmpHours * company.getEmpRatePerHrs();
		company.setTotalEmpWage(totalEmpWage);
	}

public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		// Directly calling function without creating obj 'cause its a static one.
		Company company1 = new Company("Dmart", 20, 10, 100);
		calculateWage(company1); // For DMart 
		System.out.println(company1);
		System.out.println("--------------------------");
		Company company2 = new Company("JioMart", 20, 5, 100);
		calculateWage(company2); // For DMart 
		System.out.println(company2);
	}
}


class Company {

	private String name;
	private int empRatePerHrs;
	private int noOfWorkingDays;
	private int maxHrsInMonth;
	private int totalEmpWage;

	public Company(final String name, final int empRatePerHrs, final int noOfWorkingDays, 
		final int maxHrsInMonth){
		this.name = name;
		this.empRatePerHrs = empRatePerHrs;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public String getName(){
		return name;
	}

	public int getMaxHrsInMonth(){
		return maxHrsInMonth;
	}

	public int getNoOfWorkingDays(){
		return noOfWorkingDays;
	}

	public int getEmpRatePerHrs(){
		return empRatePerHrs;
	}

	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString(){
		return "Total Employee wages for comapny "+this.name+ " is : "+this.totalEmpWage;
	}
}
