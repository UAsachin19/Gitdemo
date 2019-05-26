class CountObjectstatic
{
	static int i = 0;
	CountObjectstatic()
	{
	i++;
	System.out.println("count of object is: "+i);
	}
	public static void main (String args[])
	{
		CountObjectstatic obj1 = new CountObjectstatic();
		CountObjectstatic obj2 = new CountObjectstatic();
		CountObjectstatic obj3 = new CountObjectstatic();
		CountObjectstatic obj4 = new CountObjectstatic();
		
		System.out.println("count of object " + obj1.i);
		System.out.println("count of object " + obj2.i);
		System.out.println("count of object " + obj3.i);
		System.out.println("count of object " + obj4.i);
	}
}