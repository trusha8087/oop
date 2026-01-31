/**Define a Java class named Rectangle. It should have two double data fields: width and 
height, both with a default value of 1. Implement a no-argument constructor and a 
constructor that takes width and height as parameters. Include methods getArea() and 
getPerimeter() that return the calculated area and perimeter respectively.*/

class Rectangle
{
	double width;
	double height;

	Rectangle()
	{
		width=1;
		height=1;
	}

	Rectangle(double w, double h)
	{
		width=w;
		height=h;
	}

	void getArea()
	{
		
		System.out.println("Area of Rectangle:" + (width*height));
	}

	void getParameter()
	{
		System.out.println("Parameter of Rectangle:" +(2*(width+height)));
	}

	public static void main(String[]args)
	{
		Rectangle obj1=new
			Rectangle();
		obj1.getArea();
		obj1.getParameter();

		Rectangle obj2=new Rectangle(5,6);
		obj2.getArea();
		obj2.getParameter();
	}
}