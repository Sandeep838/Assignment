package project.com;
class company{
long employeeid;
String employeeName;
String employeeAdress;
long  employeePhone;
double basicSalary;

void display(long id,String Name,String Adress,long Phone,double Salary) {
	
	System.out.println("details");
}
}
class Manager extends company{
	void Show() {
		
	}
}
class Trainee extends company{
	void Sho() {
		
	}
}
public class fourth_project {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.Show();
		m.display(101, "sandeep", "up", 25640331, 30000);
		Trainee t=new Trainee();
		t.Sho();
		

	}

}
