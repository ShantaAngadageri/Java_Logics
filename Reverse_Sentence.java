import java.util.Scanner;
class Reverse_Sentence
{
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a Sentence");
		String str=sc.nextLine();
		String word[]=str.split(" ");
		for(int i=word.length-1; i>=0;i--){
		System.out.print(word[i]+" ");
		}
	}
}

