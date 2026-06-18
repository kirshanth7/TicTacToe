package project_1;

class Student{
	int mark = 0;
}

public class Mainclass {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.mark = 2;
		Student s2 = new Student();
		s2.mark = 7;
		
		System.out.println(s1.mark);				
	}
}


