import java.util.*;
class MyProgramCube{
	public static void main(String[] args){
		float area;
		Cube c1 = new Cube();
		Cube c2 = new Cube();

		System.out.println("c1 area = " + c1.calArea(10, 10, 10));
		System.out.println("c2 area = " + c2.calArea(10, 20, 30));
	}
}

class Cube{
	float height;
	float width;
	float depth;
	
	float calArea(float h, float w, float d){
		height = h;
		width = w;
		depth = d;

		return height * width * depth;
	}
}

 
