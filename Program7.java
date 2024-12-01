import java.util.Scanner;
class Program7{

	public static void getIndexes(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				System.out.println(i);
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String s=sc.nextLine();
		getIndexes(s);	
	}
		



}