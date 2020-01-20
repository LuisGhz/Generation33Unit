package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.exercise33empleado.model.Employee;

class EmployeeTest {
	@Test
	void testCalculateBruteSalary1() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculateBruteSalary2() {
		//fail("Not yet implemented");
		Employee myEmployee = new Employee();
		
		
		double actualValue = myEmployee.calculateBruteSalary("salesEmployee", 0, 0);
		double expectedValue = 1000.0;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testCalculateBruteSalary3() {
		//fail("Not yet implemented");
		Employee myEmployee = new Employee();
		
		
		double actualValue = myEmployee.calculateBruteSalary("salesEmployee", 1000, 0);
		double expectedValue = 1100.0;
		assertEquals(expectedValue, actualValue);
	}

}
