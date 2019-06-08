class Calculator
{
	double num1, num2, result;
	
	void sum(double num1, double num2)
	{
		num1 = this.num1;
		num2 = this.num2;
		
		result = num1 + num2;
		System.out.println ("Sum of" + num1 + " " + num2 +" ; "+ result);
		
	}
	void mul (double num1, double num2)
	{
		num1 = this.num1;
		num2 = this.num2;
		
		result = num1 * num2;
		System.out.println ("Multiplication of" + num1 + " " + num2 +" ; "+ result);
	}
		void sub (double num1, double num2)
	{
		num1 = this.num1;
		num2 = this.num2;
		
		result = num1 - num2;
		System.out.println ("Subtractin of" + num1 + " " + num2 +" ; "+ result);
	}
		void div (double num1, double num2)
	{
		num1 = this.num1;
		num2 = this.num2;
		
		result = num1 / num2;
		System.out.println ("Division of" + num1 + " " + num2 +" ; "+ result);
	}
	public static void main(String args [])
		{
			Calculator A1 = new Calculator ();
			A1.sum(10, 20);
			A1.mul (10, 20);
			A1.sub (20, 10);
			A1.div (20, 10);
			
			
		}
}