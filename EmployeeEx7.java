package org.apex.assignment;

public class EmployeeEx7 {
	private int employeeNumber;
	private String employeeName;
	private String employeeAddress;
	private String employeeState;
	private String employeeCity;
	private int employeeZip;
	private String employeeDesignation;
	private int employeeExperience;
	private String employeeEmailID;
	private int employeeBaseSalary;
	private int employeeHRA;
	private int employeeBonus;		

	/**
	 * @param employeeNumber
	 * @param employeeName
	 */
	public EmployeeEx7(int employeeNumber, String employeeName) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeAddress = "None";
		this.employeeState = "None";
		this.employeeCity = "None";
		this.employeeZip = 0;
		this.employeeDesignation = "None";
		this.employeeExperience = 0;
		this.employeeEmailID = "None";
		this.employeeBaseSalary = 0;
		this.employeeHRA = 0;
		this.employeeBonus = 0;
	}

	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}

	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	/**
	 * @return the employeeState
	 */
	public String getEmployeeState() {
		return employeeState;
	}

	/**
	 * @param employeeState the employeeState to set
	 */
	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	/**
	 * @return the employeeCity
	 */
	public String getEmployeeCity() {
		return employeeCity;
	}

	/**
	 * @param employeeCity the employeeCity to set
	 */
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	/**
	 * @return the employeeZip
	 */
	public int getEmployeeZip() {
		return employeeZip;
	}

	/**
	 * @param employeeZip the employeeZip to set
	 */
	public void setEmployeeZip(int employeeZip) {
		this.employeeZip = employeeZip;
	}

	/**
	 * @return the employeeDesignation
	 */
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	/**
	 * @param employeeDesignation the employeeDesignation to set
	 */
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	/**
	 * @return the employeeExperience
	 */
	public int getEmployeeExperience() {
		return employeeExperience;
	}

	/**
	 * @param employeeExperience the employeeExperience to set
	 */
	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}

	/**
	 * @return the employeeEmailID
	 */
	public String getEmployeeEmailID() {
		return employeeEmailID;
	}

	/**
	 * @param employeeEmailID the employeeEmailID to set
	 */
	public void setEmployeeEmailID(String employeeEmailID) {
		this.employeeEmailID = employeeEmailID;
	}

	/**
	 * @return the employeeBaseSalary
	 */
	public int getEmployeeBaseSalary() {
		return employeeBaseSalary;
	}

	/**
	 * @param employeeBaseSalary the employeeBaseSalary to set
	 */
	public void setEmployeeBaseSalary(int employeeBaseSalary) {
		this.employeeBaseSalary = employeeBaseSalary;
	}

	/**
	 * @return the employeeHRA
	 */
	public int getEmployeeHRA() {
		return employeeHRA;
	}

	/**
	 * @param employeeHRA the employeeHRA to set
	 */
	public void setEmployeeHRA(int employeeHRA) {
		this.employeeHRA = employeeHRA;
	}

	/**
	 * @return the employeeBonus
	 */
	public int getEmployeeBonus() {
		return employeeBonus;
	}

	/**
	 * @param employeeBonus the employeeBonus to set
	 */
	public void setEmployeeBonus(int employeeBonus) {
		this.employeeBonus = employeeBonus;
	}
	//basic + hra + (bonus/100)*basic
	
	public int employeeTotalSalary() {
		return (this.employeeBaseSalary + this.employeeHRA + ((this.employeeBonus/100) * this.employeeBaseSalary));
	}
}
