import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortingMechanism {

	public static void main(String[] args) {
		
		Emp e1=new Emp(2,"sushant", 10000);
		Emp e2=new Emp(1,"Akash", 30000);
		Emp e3=new Emp(4,"akki", 20000);
		Emp e4=new Emp(3,"zero", 1000);
		
	List<Emp> list=new ArrayList<>();
list.add(e1);
list.add(e2);
list.add(e3);
list.add(e4);

System.out.println("before sorting"+list);
Collections.sort(list, new NameSort());
System.out.println("after sorting"+list);
	}

}

class NameSort implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		//return o1.getEmpid()-o2.getEmpid();
		return o1.getEmpnm().compareTo(o2.getEmpnm());
	}
	
}




class Emp  {
	int empid;
	String empnm;
	int salary;
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n Emp [empid=" + empid + ", empnm=" + empnm + ", salary=" + salary + "]";
	}
	public Emp(int empid, String empnm, int salary) {
		super();
		this.empid = empid;
		this.empnm = empnm;
		this.salary = salary;
	}
	
}
