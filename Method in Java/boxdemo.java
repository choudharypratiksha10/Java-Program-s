class box
{
	double width;
	double height;
	double depth;

	void volume() { //Method
		System.out.println("Volume is : " + (width * height * depth));
	}
}
class boxdemo {
	public static void main(String[] args) {
		box mybox = new box(); //Creating objects
		
		mybox.width = 10; 		//Assigning members
		mybox.height = 20;
		mybox.depth = 15;

		mybox.volume();	//Calling a Method
	}
}