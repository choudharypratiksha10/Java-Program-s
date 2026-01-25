class StaticDemo{
	static int a = 4;	//static variable declared & initialized
	static int b;	//static variable declared

	static void dispValue(int x){
		System.out.println("Static method initialized");
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}	//static method

	static{
		System.out.println("Static block initialized");
		b = a * 5;
	}	//static block

	public static void main(String[] args){
		System.out.println("Inside main()....");
		dispValue(28);
	}	//main
}	//class