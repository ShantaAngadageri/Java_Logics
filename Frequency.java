class Frequency
{
	public static void main(String[] args)
	{
		String str="DotNet555";
		System.out.println("UpperCase- "+str.replaceAll("[^A-Z]","").length());
		System.out.println("LowerCase- "+str.replaceAll("[^a-z]","").length());
		System.out.println("Digits- "+str.replaceAll("[^0-9]","").length());
		/*String str="aabbccd";
		int [] arr=new int[128];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i+"-" +arr[i]);
			}
		}*/
	}
}