package Emp_Wage_Problem;

public class Emp_Wage_Computation_prob {
	
	public static void main(String[] args) {
		
		// Constant
		int IS_FULL_TIME = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Welcome to Employee Wage computation Program.");
		if (empCheck == IS_FULL_TIME) 
		{
			System.out.println("Employee is Present.");
		}
		else
		{
			System.out.println("Employee is Abscent.");
		}
		
	}

}