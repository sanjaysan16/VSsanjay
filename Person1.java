package Lab1;

public class Person1 {
	public static void main(String[]args) {
		Person p1=new Person();
		p1.setName("sanjay");
		p1.setAge(21);
		p1.setAddres("chengalpattu");
		
		Person p2=new Person("benin",21,"kanyakumari");
		Person p3=new Person("deeraj",17,"chengalpattu");
		Person p4=new Person("jv",22,"thambaram");
		System.out.println("Name" + " " +p1.getName()+" "+"age"+p1.getAge()+ " " +"address"+p1.getAddres());
	
		
	//System.out.println(p2);
	Employee em=new Employee();
	System.out.println(em.Employeeid);
	em.setEmployeeid(17);
	//em.setAddres("chengalpattuuuu");
	System.out.println(em.getEmployeeid());
	//System.out.println(em.getAddres());
	//Person.count();
		
	}

}
