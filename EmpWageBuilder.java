public class EmpWageBuilder {
	public static final int is_FullTime = 1;
	public static final int is_PartTime = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		int empHrs = 0;
		int empWage = 0;

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
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
