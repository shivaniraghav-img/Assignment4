// this program calculate Area of square and circle
abstract class Shape
{
	abstract Number calculateArea();//abstract method
	
}
class Circle   extends Shape
{
	private final double base;// final variable
	private final double height;// final variable
	Circle(double base, double height) // constructor
	{
		this.base= base;
		this.height=height;
	}
	Double calculateArea() {  //override method
		return(base/2)*height;
	}
	void display()
	{
		System.out.println("Area of circle:"+calculateArea());// circle Area
	}
}
class Square  extends Shape
{
	private final double side;
	Square(double side){
		this.side=side;
	}
		Double calculateArea() {    //override method
			return side*side;
		}
		void display()
		{
			System.out.println("Area of circle:"+calculateArea());//square area
		}
	
}
public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Circle C= new Circle(5,8);
   C.calculateArea();
   Square S= new Square(4);
   S.calculateArea();
	}

}
