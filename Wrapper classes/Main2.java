class Main2{
	public static void main(String[] args){
		//creates objects of wrapper class
		Integer aObj = Integer.valueOf(23);
		Double bObj = Double.valueOf(5.55);

		//converts into primitive types
		int a = aObj.intValue();	//converting Integer to int explicitly
		double b = bObj.doubleValue();	//converting Double to double explicitly
		int c = aObj;	//unboxing, now compiler will write aObj.intValue() internally

		System.out.println("The value of a: " + a);
		System.out.println("The value of b: " + b);
		System.out.println("The value of aObj: " + aObj);
	}
}