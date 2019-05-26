class Employee
{
	String empId = "E101";
	String name = "SSJ Jack";
	double salary = 50000;
	int age = 32;
	static String companyName = "ABC";

		public static void main(String args[])
		
		{
			Employee e1 = new Employee ();
			System.out.println ("employee id is :" + e1.empId);
			System.out.println ("employee name is :" + e1.name);
			System.out.println ("employee salary is :" + e1.salary);
			System.out.println ("employee age is :" + e1.age);
			System.out.println ("employee age is :" + companyName);
		}
}