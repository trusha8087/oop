import java.util.Scanner;
class p1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value in meters");
        double meter=sc.nextDouble();
        double feet=meter*3.28084;
        System.out.println("converted distance in feet:"+String.format("%2f",feet));

sc.close();
    }
}