import java.util.Scanner;
class Program12{
	
	public static String getReverse(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return rev;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		String rev=getReverse(s);
		System.out.println("The reverse of "+s+" is "+rev);
	}

}