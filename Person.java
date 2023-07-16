package Lab1;

public class Person {
	String name;
	int age;
	String addres;
	static int count;
	
	Person(){
		count++;
		
	}
	
	Person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.addres=addres;
		
		//count++;
	}
	Person(String name,int age,String address,int id,double salary){
		this.name=name;
		this.age=age;
		this.addres=addres;
		
		//count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addres=" + addres + "]";
	}
	
	
	

}
