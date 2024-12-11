import java.util.Scanner;
class Program13{
	
	public static boolean checkPalindrome(String s){
		int start_i=0;
		int end_i=s.length()-1;
		int mid=s.length()/2;
		for(int i=start_i;i<=mid;i++){
			if(s.charAt(i)==s.charAt(end_i))
				end_i--;
			else
			        return false;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		boolean res=checkPalindrome(s);
		if(res)
			System.out.println(s+" is Palindrome String");
		else
			System.out.println(s+" is Not A Palindrome String");
	}

}