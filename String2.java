class String2
{
	public static void main(String[] args)
	{
		String str="My mom knows malayalam she is from katak place it is in gadag district";
		String[] s1=str.split(" ");
		for (int i=0;i<s1.length ;i++ )
		{
			Length_Four(s1[i]);
		}
	}
		static void Length_Four(String str)
		{
			if(str.length()>4)
			{
			System.out.println(str);
			}
		}
}