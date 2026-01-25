class Student{
	String name;
	int roll_no;

	Student(String s_name, int s_roll){
		System.out.println("Constructor Invoked");
		this.name = s_name;
		this.roll_no = s_roll;
	} //Constructor1

	Student(Student s){
		System.out.println("CopyConstructor Invoked");
		
		this.name = s.name;
		this.roll_no = s.roll_no;
	}

	public void display(){	
		System.out.println("Name = " + name);
		System.out.println("Roll Number = " + roll_no);
	}
}

class MyProgramCopy{
	public static void main(String[] args){
		float area;
		Student s1 = new Student("Darshan", 101);
		Student s2 = new Student(s1);	
		
		s1.display();
		s2.display();
	}
}