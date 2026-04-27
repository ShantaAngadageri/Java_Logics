import java.util.Scanner;
class Replace
{
	public static void main(String[] args)
	{
		
		
		
		//remove character from the string
		//String str="programming";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string");
		String str=sc.nextLine();
		str=str.replace("p","");
		System.out.println(str);
		
		
		
		
		
		
		//remove all occurance of character
		/*String str="programming";
		str=str.replaceAll("g","");
		System.out.println(str);*/
	}
		
}