class Student{
	int roll_no;
	String name;

	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
	
	void printStudentDetail(){
		System.out.println("| " +  roll_no + " | -- | " + name + " |");
	}
}

public class ArrayOfObjectDemo{
	public static void main(String[] args){
		Student[] stu = new Student[3];

		stu[0] = new Student(101, "SBJAIN");
		stu[1] = new Student(102, "OOPs");
		stu[2] = new Student(103, "Java");

		stu[0].printStudentDetail();
		stu[1].printStudentDetail();
		stu[2].printStudentDetail();
	}
}
