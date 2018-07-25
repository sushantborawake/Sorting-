package com.util.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int empid;
	private String empnm;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empnm) {
		super();
		this.empid = empid;
		this.empnm = empnm;
	}

	@Override
	public String toString() {
		return "\n Employee [empid=" + empid + ", empnm=" + empnm + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpnm() {
		return empnm;
	}

	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}

	@Override
	public int compareTo(Employee o) {
		
		return (this.getEmpid()-o.getEmpid()==0)? this.getEmpnm().compareTo(o.getEmpnm()):this.getEmpid()-o.getEmpid();
	}
}

public class TestTreeset {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "shraddha");
		Employee e2 = new Employee(3, "tanmayee");
		Employee e3 = new Employee(4, "tanmayee");
		Employee e4 = new Employee(1, "shraddha");
		Employee e5 = e2;

		Comparator<Employee> basedonid=new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (o1.getEmpid()-o2.getEmpid()==0)? o1.getEmpnm().compareTo(o2.getEmpnm()):o1.getEmpid()-o2.getEmpid();
			}
		};
		
		TreeSet<Employee> t=new TreeSet<>(basedonid);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
	
		System.out.println(t);
	}

}
