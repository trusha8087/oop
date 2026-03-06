class University { 
    static int totalStudents; 
    static String universityName; 
    static { 
        universityName = "GTU University"; 
        totalStudents = 0; 
        System.out.println("Trusha - 240390107034"); 
        System.out.println("Block Executed"); 
        System.out.println("University Name: " + universityName); 
    } 
    { 
        System.out.println("Instance Block Executed"); 
    } 
 
    University() { 
        totalStudents++; 
        System.out.println("Constructor Executed"); 
        System.out.println("Student Created. Total Students: " + totalStudents); 
        System.out.println("--------------------------------"); 
    } 
 
    static int getTotalStudents() { 
        return totalStudents; 
    } 
 
    public static void main(String[] args) { 
        System.out.println("Main Method Started\n"); 
         
        University s1 = new University(); 
        University s2 = new University(); 
        System.out.println("Final Total Students: " + University.getTotalStudents()); 
    } 
} 