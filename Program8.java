import java.util.Scanner;
class Program8{

	public static void printIndexOfSpaceChar(String s){
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch==' ')
				System.out.println(i);
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String s=sc.nextLine();
		printIndexOfSpaceChar(s);
	}
	

}