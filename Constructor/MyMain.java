class Cube{
	double width;
	double height;
	double depth;

	Cube(){
		width = 10;
		height = 10;
		depth = 10;

		System.out.println("Volume = " + width * height * depth);
	}
}

class MyMain{
	public static void main(String[] args){
		Cube c = new Cube();
	}
}