import java.util.Scanner;
class CountNumberOfWords{
	
	public static int countWords(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if( (i==0 && s.charAt(i)!=' ') || (s.charAt(i)!=' ' && s.charAt(i-1)==' ') )
				count++;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s1=sc.nextLine();
		int countWords=countWords(s1);
		System.out.println("Total words are "+countWords);
		
	}

}
