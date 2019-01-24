package org.apex.assignment;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeEx7 employee1 = new EmployeeEx7(100, "employee1");
		EmployeeEx7 employee2 = new EmployeeEx7(200, "employee2");
		
		//System.out.println(employee2.getEmployeeAddress());
		
		//employee1.setEmployeeName("employee1");
		//employee1.setEmployeeNumber(100);
		employee1.setEmployeeAddress("1 aa Street");
		employee1.setEmployeeState("CA");
		employee1.setEmployeeCity("Fremont");
		employee1.setEmployeeZip(99999);
		employee1.setEmployeeDesignation("Manager");
		employee1.setEmployeeExperience(15);
		employee1.setEmployeeEmailID("employee1@xyz.com");
		employee1.setEmployeeBaseSalary(10000);
		employee1.setEmployeeHRA(2000);
		employee1.setEmployeeBonus(1000);
		
		//employee2.setEmployeeName("employee2");
		//employee2.setEmployeeNumber(100);
		employee2.setEmployeeAddress("2 bb Street");
		employee2.setEmployeeState("MA");
		employee2.setEmployeeCity("Boston");
		employee2.setEmployeeZip(44444);
		employee2.setEmployeeDesignation("Lead");
		employee2.setEmployeeExperience(12);
		employee2.setEmployeeEmailID("employee2@abc.com");
		employee2.setEmployeeBaseSalary(9000);
		employee2.setEmployeeHRA(1000);
		employee2.setEmployeeBonus(500);
		
		System.out.println(employee1.employeeTotalSalary());
		System.out.println(employee2.employeeTotalSalary());
		System.out.printf("Employee name: %s  Total salary is : %d\n", employee1.getEmployeeName(), employee1.employeeTotalSalary());
		System.out.printf("Employee name: %s  Total salary is : %d\n", employee2.getEmployeeName(), employee2.employeeTotalSalary());
			
	}

}
