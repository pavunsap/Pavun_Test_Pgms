package tasks;

public class Student {
	int rno;
	String name;
	String branch;

	
	public void display(){
		System.out.println("Student Roll Number is :"+ rno);
		System.out.println("Student Name is :"+ name);
		System.out.println("Student Branch is :"+ branch);
		
	}
	
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.rno=1;
		st1.name="Pavun";
		st1.branch="CSE";
		
		Student st2 = new Student();
		st2.rno=2;
		st2.name="Ram";
		st2.branch="BCA";
		
		System.out.println("Student 1:");
		st1.display();
		System.out.println("###########-------##########");
		System.out.println("Student 2:");
		st2.display();
	}

}
