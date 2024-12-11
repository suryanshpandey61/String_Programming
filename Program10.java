import java.util.Scanner;
class Program10{
	
	public static int getSum(String s){
		int sum=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				sum=sum+ch-48;	
		}
		return sum;	
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		int sum=getSum(s);
		System.out.println("Sum of numeric character in:"+s+" = "+sum);
	}

}