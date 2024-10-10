package emp;

class Emp {
	String name;
	int id;
	double sal;
	String address;

	public Emp(String name, int id, double sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

}

public class main {
	public static void main(String[] args) {
		Emp emp = new Emp("Simon", 1, 25000, "Borivali Mumbai");
		System.out.println(emp);
		
		

	}
}
