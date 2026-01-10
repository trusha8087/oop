// Write a Java program that accepts a five-digit integer from the keyboard. Your program 
// should then create a new number by adding one to each digit of the input number. For 
// example, if the input is 12391, the output should be 23402 (note: 9+1=10, so it becomes 0 
// with a carry) 

import java.util.Scanner;
class P6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to our program");
        System.out.println("Enter five digit number:");

        int num = sc.nextInt();
        int d1 = (num % 10);
        int d2 = (num / 10) % 10;
        int d3 = (num / 100) % 10;
        int d4 = (num / 1000) % 10;
        int d5 = (num / 10000) % 10;

        d1 = (d1 + 1) % 10;
        d2 = (d2 + 1) % 10;
        d3 = (d3 + 1) % 10;
        d4 = (d4 + 1) % 10;
        d5 = (d5 + 1) % 10;

        int newNum = (d5 * 10000) + (d4 * 1000) + (d3 * 100) + (d2 * 10) + d1;
        System.out.println("your 5 digit number is:"+newNum);
        System.out.println("Thank you!!");

        sc.close();
    }
}

