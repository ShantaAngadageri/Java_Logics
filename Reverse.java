import java.util.Scanner;
class Reverse
{
	public static void main(String[] args){
		//String str="Level";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a String");
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1; i>=0;i--){
			res=res+str.charAt(i);
		}w
		System.out.println(res);
	}
}