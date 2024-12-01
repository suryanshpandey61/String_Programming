import java.util.Scanner;
class Program2{

	public static int countNumericCharacter(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
				count++;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		int count=countNumericCharacter(s);
		System.out.println("Total Numeric character in "+s+" are:"+count);
	}


}