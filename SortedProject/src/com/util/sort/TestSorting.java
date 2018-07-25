package com.util.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {
public static void main(String[] args) {
	usingDomainClass();
}

private static void usingDomainClass(){
	List<Employee> l1=getDummyList();
	
	Collections.sort(l1,UsingUtil.sortbyid);
	System.out.println("sort by id"+l1);
	
	Collections.sort(l1,UsingUtil.sortbysalary);
	System.out.println("sort by salary"+l1);
	
	Collections.sort(l1,UsingUtil.sortbyidnname);
	System.out.println("sort by idnname"+l1);
	
	
}

public static void sortUsingAnnonymus() {
	
	List<Employee> l1=getDummyList();
	
Comparator<Employee> sortbyid=new Comparator<Employee>() {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid()-o2.getEmpid();
	}
};	
System.out.println("sorting by id");
Collections.sort(l1,sortbyid);
System.out.println(l1);


Comparator<Employee> sortbysalary=new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}
};	

System.out.println("sorting by salary");
Collections.sort(l1,sortbysalary);
System.out.println(l1);


Comparator<Employee> sortbyidnname=new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
	int	Temp=o1.getEmpnm().compareTo(o1.getEmpnm());
		if(Temp==0){
			Temp=o1.getEmpid()-o2.getEmpid();
		}
		return Temp;
	}
};	

System.out.println("sorting by idnname");
Collections.sort(l1,sortbyidnname);
System.out.println(l1);

}



public static List<Employee> getDummyList() {
		Employee e1=new Employee(1,"sushant",20000);
		Employee e2=new Employee(3,"pranjali",40000);
		Employee e3=new Employee(2,"akash",50000);
		Employee e4=new Employee(4,"akash",30000);
		
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		return list;
		
		
		
}



}

class Employee{
	private int empid;
	private String empnm;
	private long salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empnm, long salary) {
		super();
		this.empid = empid;
		this.empnm = empnm;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n Employee [empid=" + empid + ", empnm=" + empnm + ", salary=" + salary + "]";
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}




class UsingUtil{
	
	
static Comparator<Employee> sortbyid=new Comparator<Employee>() {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid()-o2.getEmpid();
	}
};	


static Comparator<Employee> sortbysalary=new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}
};	




static Comparator<Employee> sortbyidnname=new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
	int	Temp=o1.getEmpnm().compareTo(o1.getEmpnm());
		if(Temp==0){
			Temp=o1.getEmpid()-o2.getEmpid();
		}
		return Temp;
	}
};	



	
}