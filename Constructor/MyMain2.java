class Cube{
	double width, height, depth;

	Cube(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	void calVolume(){
		System.out.println("Volume = " + width * height * depth);
	}
}

class MyMain2{
	public static void main(String[] args){
		Cube c = new Cube(10, 10, 10);
		c.calVolume();
	}
}