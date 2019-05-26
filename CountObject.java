class CountObject
{
	int i = 0;
	CountObject(){
	i++;
	System.out.println("count of object is: "+i);
	}
	
	public static void main (String args[])
	{
		CountObject obj1 = new CountObject();
		CountObject obj2 = new CountObject();
		CountObject obj3 = new CountObject();
		CountObject obj4 = new CountObject();
		
		System.out.println("count of object " + obj1.i);
		System.out.println("count of object " + obj2.i);
		System.out.println("count of object " + obj3.i);
		System.out.println("count of object " + obj4.i);
	}
}