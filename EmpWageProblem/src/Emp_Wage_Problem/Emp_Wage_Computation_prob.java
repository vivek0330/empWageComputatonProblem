package Emp_Wage_Problem;

public class Emp_Wage_Computation_prob {
	
	// Constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		// Variables
		int empHrs = 0;
		int empWage = 0;
		// Computation
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("Welcome to Employee Wage computation Program.");
		switch (empCheck) {
		    	case IS_FULL_TIME:
		    		System.out.println("Employee is Full time.");
				empHrs = 8;
				break;
			case IS_PART_TIME: 
				System.out.println("Employee is Part time.");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is Abscent.");
				empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
		
	}

}