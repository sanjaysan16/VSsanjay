package Lab1;

public class Employee extends Person{
	int Employeeid;
	double salary;
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddres() {
		return addres;
	}

}
