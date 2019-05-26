class Student
{
	 int rollNo;
	 String studentName;
	 static String schoolName;
	 int marks;
	 
	 void setStudentDetails(int rollNo, String studentName, int marks)
	 {
		 this.rollNo = rollNo;
		 this.studentName = studentName;
		 this.marks = marks;
	 }
	 void displayStudentdeails()
	 {
		 System.out.println("Student detail "+ rollNo + " " + studentName + " " + schoolName + " " + marks); 
	 }
	
		public static void main(String args [])
		{
			Student s1 = new Student();
			Student s2 = new Student();
			schoolName = "Zee School";
			s1.setStudentDetails(100, "Sachin", 55);
			s2.setStudentDetails(101, "Amol", 75);
			s1.displayStudentdeails();
			s2.displayStudentdeails();
			schoolName = "My New School";
			s1.displayStudentdeails();
			s2.displayStudentdeails();
			s1.rollNo = 220;
			s2.marks = 95;
			s1.displayStudentdeails();
			s2.displayStudentdeails();
		
			Student s3 = new Student();
			Student s4 = new Student();
			s3.setStudentDetails(500, "Aditya", 88);
			s4.setStudentDetails(555, "Ashwin", 99);
			s3.displayStudentdeails();
			s4.displayStudentdeails();
			
		}
	
}