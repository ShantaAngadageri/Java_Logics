import java.util.Scanner;
class palindrome
{
	public static void main(String[] ars){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		if(res.equalsIgnoreCase(str)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}		
}
