import java.util.Scanner;
class Program5{
	
	public static void countAllThings(String s)
        {
		int upper_count=0;  int lower_count=0;
		int numeric_count=0; int spcl_char_count=0;
		for(int i=0; i<s.length(); i++){
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
				upper_count++;
			else if(ch>=97 && ch<=122)
				lower_count++;
			else if(ch>='0' && ch<='9')
				numeric_count++;
			else
				spcl_char_count++;					
		}
		System.out.println(upper_count);
		System.out.println(lower_count);
		System.out.println(numeric_count);
		System.out.println(spcl_char_count);		
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		countAllThings(s);
		
		
			
	}
}