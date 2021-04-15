public class EmpWageBuilder {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		int is_FullTime = 1;
		int EMP_RATE_PER_HOUR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;

		if(empCheck == is_FullTime)
			empHrs = 8;
		else
			empHrs = 0;

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
