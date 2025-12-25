class Person
{
	String name;
	int age;
} //Class Person
class MyPerson {
	public static void main(String[] args) {
		Person p1 = new Person(); //creating object p1
		Person p2 = new Person(); //creating object p2

		p1.name = "Modi";
		p1.age = 71;		//accessing data member of Person class
		p2.name = "Bachchan";
		p2.age = 80;

		System.out.println("p1.name = " + p1.name);
		System.out.println("p2.name = " + p2.name);
		System.out.println("p1.age = " + p1.age);
		System.out.println("p2.age = " + p2.age);
	}
}		