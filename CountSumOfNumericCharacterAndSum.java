import java.util.Scanner;
class CountSumOfNumericCharacterAndSum{
		
	public static void getCountAndSum(String s){
		int count=0;
		int sum=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9'){
				sum=sum+(int)ch;
				//sum=sum+(ch-48);
				count++;
			}
		}
		System.out.println(s+" countains "+count+" Numeric Characters & Sum is:"+sum);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		getCountAndSum(s);
	}


}