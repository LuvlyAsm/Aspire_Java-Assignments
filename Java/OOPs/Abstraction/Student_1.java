package OOPs.Abstraction;

public class Student_1 extends Teacher {

	public void study() {
	System.out.println("Studied");
	}
	public static void main(String[] args) {
	System.out.println("Teacher Name is : "+ teacherName);
	Student_1 s=new Student_1();
	System.out.print("Status : ");
	s.study();
	}
}