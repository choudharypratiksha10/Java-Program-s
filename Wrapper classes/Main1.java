class Main1{
	public static void main(String[] args){
		// create primitive types
		int a = 5;
		double b = 5.65;

		//convert into wrapper objects
		Integer aObj = Integer.valueOf(a);	//converting int into Integer explicitly
		Double bObj = Double.valueOf(b);	//converting double into Double explicitly
		Integer c = a;	//autoboxing, now compiler will write Integer.valueOf(a)internally
		
		if(aObj instanceof Integer){
			System.out.println("An object of Integer is created");
		}

		if(bObj instanceof Double){
			System.out.println("An object of Double is created");
		}

		System.out.println(a +" " + aObj + " " + bObj + " " + c);
	}
}
