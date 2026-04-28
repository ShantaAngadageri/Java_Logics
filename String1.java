class String1
{
	public static void main(String[] args)
	{
		String str="My mom knows malayalam she is from katak place it is in gadag district";
		String[] s1=str.split(" ");
		for (int i=0;i<s1.length ;i++ )
		{
			palindrome(s1[i]);
		}
	}
		static void palindrome(String str)
		{
			int i=0, j=str.length()-1;
			while(i<j)
			{
				if(str.charAt(i)!=str.charAt(j)){
					return;
				}
				i++;
				j--;
			}
			System.out.println(str);
		}
}