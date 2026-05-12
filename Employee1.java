class Employee1 {
    String name = "Trusha";
    String department = "CE";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}


class Manager extends Employee {
    int teamSize = 8;
    String projectName = "AI Development";

   
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}


public class Test1 {
    public static void main(String[] args) {
        System.out.println("240390107034 - Trusha Patel");
        Employee e = new Employee();
        Employee m = new Manager(); 

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails(); 
    }
}
