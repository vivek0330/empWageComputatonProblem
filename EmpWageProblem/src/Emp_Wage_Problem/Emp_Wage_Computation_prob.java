package Emp_Wage_Problem;

public class Emp_Wage_Computation_prob {
	
	public static void main(String[] args) {
		
		// Constant
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		// Variables
		int empHrs = 0;
		int empWage = 0;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		System.out.println("Welcome to Employee Wage computation Program.");
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Full time.");
			empHrs = 8;
		}
		else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is Part time.");
			empHrs = 4;
		}
		else {
			System.out.println("Employee is Abscent");
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
		
	}

}