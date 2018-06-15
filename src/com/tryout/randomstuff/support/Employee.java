package com.tryout.randomstuff.support;

public class Employee {
	
	int id;
	String orgName;
	double salary;
	
	@Override
	public String toString() {
		return id +" = "+ salary + " "+orgName;
	}
	public Employee(){
		
	}
	
	public Employee(int id,String orgName,double salary){
		this.id = id;
		this.orgName = orgName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrgName() {
		return orgName;
	}

	
	private void setOrgName(String orgName) {
		System.out.println("inside set org name "+orgName);
		this.orgName = orgName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
