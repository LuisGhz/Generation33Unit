package com.exercise33empleado.model;

public class Employee {
	
	private enum EmployeeTypes {
		salesEmployee,
		manager
	}
	
	public double calculateBruteSalary(String employeeType, double salesPerMonth, int extraHours)
	{
		double bruteSalary = 0, salarySales = 0, salaryHours = 0;
		final double SALARY_EMPLOYEE = 1000.0;
		final double SALARY_MANAGER = 1500.0;
		final double SALES_FIRST_BONUS_LIMIT = 1000.0;
		final double FIRST_BONUS = 100.0;
		final double SALES_SECOND_BONUS_LIMIT = 1500.0;
		final double SECOND_BONUS = 200.0;
		final double EXTRA_HOURS_PAYMENT = 20.0;
		
		if (salesPerMonth >= SALES_FIRST_BONUS_LIMIT && salesPerMonth < SALES_SECOND_BONUS_LIMIT) 
		{
			salarySales = FIRST_BONUS;
		}
		else if(salesPerMonth > SALES_SECOND_BONUS_LIMIT)
		{
			salarySales = SECOND_BONUS;
		}
		
		salaryHours = extraHours * 	EXTRA_HOURS_PAYMENT;
		
		return bruteSalary = (employeeType.equals(EmployeeTypes.salesEmployee.toString())) ? SALARY_EMPLOYEE + salarySales + salaryHours : SALARY_MANAGER + salarySales + salaryHours;
		
	}
}
