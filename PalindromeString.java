import java.util.Scanner;
class PalindromeString{
	
	public static String reverse(String s){
		String rev="";
		for(int i=0;i<s.length();i++){
			rev=s.charAt(i)+rev;
		}	
		return rev;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		String rev=reverse(s);
		System.out.println("The reverse of "+s+ " is "+rev);
		if(s.equals(rev)){
			System.out.println("Yes it is Palindrome");
		}
		else{
			System.out.println("No it is Not Palindrome");
		}
	}
}