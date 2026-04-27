import java.util.Scanner;
class palindrome1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		String[] word=str.split(" ");
		for(int i=0;i<word.length ;i++ )
		{
			palindrome(word[i]);
		}
    }
	static void palindrome(String str){
		int i=0,j=str.length()-1;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j))
			{
				return;
			}
			i++;
			j--;
		}
		System.out.println(str);
	}
}