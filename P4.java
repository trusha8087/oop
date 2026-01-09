// Develop a Java application that calculates a person's Body Mass Index (BMI). The program 
// should ask the user for their weight in pounds and height in inches. Convert these values to 
// kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and 
// then calculate BMI (weight in kg / (height in meters)^2). Display the calculated BMI. 

import java.util.Scanner;
class P4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to check your BMI!");

    System.out.println("Enter your weight in pound:");
    double weight = sc.nextDouble();

    System.out.println("Enter your height in inch:");
    double height = sc.nextDouble();

    weight = (weight * 0.45359237);
    height = (height * 0.0254);

    double BMI = (weight / (height * height));
    System.out.printf("Your BMI is: %.2f",BMI);
    sc.close();


}
}