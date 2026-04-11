// Design a base class Shape with two double data members d1 and d2 to store dimensions. 
// Include a method getData(double d1, double d2) to initialize these dimensions. Create two 
// derived classes, Triangle and Rectangle, which inherit from Shape. Each derived class 
// should have its own method to calculate its specific area.

class Shape{
	double d1;
	double d2;

	void getData(double a, double b){
		d1=a;
		d2=b;
	}
}
	class Triangle extends Shape{
		double area(){
		return 0.5*d1*d2;
		}
	}
	class Rectangle extends Shape{
		double area(){
		return d1*d2;
		}
	}
public class Shape1{
public static void main(String []args){
	Triangle t = new Triangle();
	Rectangle r = new Rectangle();         

	t.getData(5,6);
	r.getData(4,8);

	System.out.println("Triangle area="+ t.area());
	System.out.println("Rectangle area="+ r.area());

}
}



