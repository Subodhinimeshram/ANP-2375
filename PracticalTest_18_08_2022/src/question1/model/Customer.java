package question1.model;
public class Customer {
	
	private int id;
	private String name;
	private int age;
	
	public Customer() {
	//empty constructor
	}
	public Customer(int Aid,String Aname,int Aage) {
		id=Aid;
		name=Aname;
		age=Aage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
