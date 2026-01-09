

import java.util.Scanner;
public class P2{

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of a:");
        double a=sc.nextDouble();
    System.out.println("enter value of b:");
        double b=sc.nextDouble();
    System.out.println("enter value of c:");
        double c=sc.nextDouble();
    System.out.println("enter value of d:");
        double d=sc.nextDouble();
    System.out.println("enter value of e:");
        double e=sc.nextDouble();
    System.out.println("enter value of f:");
        double f=sc.nextDouble();

double D = (a*d)-(b*c);
if(D==0){
    System.out.println("the denominator is zero");
}else{
    double Dx= (e*d)-(b*f);
    double Dy= (a*f)-(a*c);


double x = (Dx / D);
double y = (Dy / D);
System.out.println("the value of x:"+String.format("%.2f",x));
System.out.println("the value of y:"+String.format("%.2f",y));
}
sc.close();
}

}
