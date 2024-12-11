import java.util.Scanner;
class Program11{
	
	public static int getEvenSum(String s){
		int sum=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9' && ch%2==0)
				sum=sum+ch-48;	
		}
		return sum;	
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		int sum=getEvenSum(s);
		System.out.println("Sum of Even numeric character in:"+s+" = "+sum);
	}

}