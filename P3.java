// Write a Java program that prompts the user to enter a single letter (character). Determine 
// whether the entered character is a vowel (a, e, i, o, u, case-insensitive) or a consonant, and 
// display the result.

import java.util.Scanner;
class P3{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a single letter");
    char ch = sc.next().charAt(0);

    if(!((ch >= 'A' && ch <= 'z') || (ch >= 'a' && ch <= 'z'))){

        System.out.println("enter a valid alphabet");
    }else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

        System.out.println("number is vowel!");
    }else{
        System.out.println("number is consonant!");

    }
    sc.close();
}
}