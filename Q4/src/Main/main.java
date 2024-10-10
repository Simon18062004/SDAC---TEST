package Main;

import emp.Emp;
import manager.Manager;

public class main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.calsal(25000));

		Manager manager = new Manager();
		System.out.println(emp.calsal(25000, 5000));

	}
}
