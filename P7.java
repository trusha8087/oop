//  Write a program that takes the lengths of three sides of a triangle as input. Calculate and 
// print the area of the triangle. Ensure that the program validates if the given side lengths can 
// actually form a triangle (sum of any two sides must be greater than the third side) before 
// calculating the area (use Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = 
// (a+b+c)/2). 

 import java.util.Scanner;
 class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to our program!!");
        System.out.println("Enter value of side A:");
        double a = sc.nextDouble();

        System.out.println("Enter value of side B:");
        double b = sc.nextDouble();

        System.out.println("Enter value of side C:");
        double c = sc.nextDouble();

        if((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("This is a triangle!");
            double s = ((a + b + c) / 2);
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("the area of triangle is: %.2f", area);
        }else{
            System.out.println("This is not a triangle!");
        }

    sc.close();


    }
    
}
