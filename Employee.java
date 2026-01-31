import java.util.Scanner;

class Employee {
	private String employeeName;
	private double employeeSalary;

	public void readEmployeeData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of employee :");
		employeeName = sc.nextLine();
		System.out.println("Enter the Salary of Employee :");
		employeeSalary = sc.nextDouble();
        sc.close();
	}
	public void displayEmployeeData(){
		System.out.println("Name :" +employeeName);
		System.out.println("Salary :" +employeeSalary);
	}

	public static void main(String[] args){
		System.out.println("Enrollnment no. 240390107034");
		Employee emp = new Employee();

		emp.readEmployeeData();
		emp.displayEmployeeData();

	}

}