import java.util.*;

class Rectangle{
	static float height;
	static float width;

	static void calArea(){
		System.out.println("Area = " + height * width);
	}
}

class MyRectangle{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Height: ");
		r1.height = sc.nextFloat();

		System.out.print("Enter Width: ");
		r1.width = sc.nextFloat();

		Rectangle.calArea();
	}
} 