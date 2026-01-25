class Cube{

	double width, height, depth;
	
	Cube(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	double calVolume(){
		return width * height * depth;
	}
}

class MyMain3{
	public static void main(String[] args){
		double vol;

		Cube c = new Cube(10, 10, 10);
		vol = c.calVolume();

		System.out.println("Volume = " + vol);
	}
}