import java.util.Scanner;
class Reverse1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		String[] word=str.split(" ");
		for(int i=0;i<word.length;i++)
		{
			Reverse(word[i]);
		}
	}
	
	/*
	static void Reverse(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);
	}
	static void Reverse(String str)
	{
		char[] ch=str.toCharArray();
		int i=0, j=ch.length-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(ch);
	}*/
	
}