class SecondStar
{
	public static void main( String [] args)
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 4; j >= 1; j--)
			{
				if (j > i){
				System.out.print(" ");
				}
				else
				System.out.print("*");
			}
			for (int k = 1; k < i; k++){
				System.out.print ("*");
			}
			System.out.println();
		}
		for (int i = 1; i <=4 ; i++)
		{
		for (int k = 3; k >= 1; k--)
		{
			if (i+k <= 4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for (int j = 4; j >= i; j--){
			System.out.print ("*");
		}
		System.out.println("");
		}
	}
}
