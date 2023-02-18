package project.com;
class Salary{
	double basicSalary=30000;
	double specialAllowence=250.80;
	double Hra=1000.50;
	void calculateSalary() {
		double salary;
		 salary=basicSalary+(basicSalary*specialAllowence/100)+(basicSalary*Hra/100);
		System.out.println("Salary is:-"+salary);
	}
}

public class Calculate_Salary {

	public static void main(String[] args) {
		Salary s=new Salary();
		s.calculateSalary();

	}

}
