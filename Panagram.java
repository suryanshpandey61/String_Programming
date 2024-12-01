import java.util.Scanner;
class Panagram{
	
	public static int[] getArrayFreq(String s){
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
				freq[ch-65]++;
			else if(ch>=97 && ch<=122)
				freq[ch-97]++;
		}
		return freq;
	}

 	public static boolean checkPanagram(String s){
		int[] freq=getArrayFreq(s);
		for(int i=0;i<freq.length;i++){
			if(freq[i]==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.nextLine();
		boolean res=checkPanagram(s);
		if(res)
			System.out.println("Given String is Panagram");

		else 
			System.out.println("Given String is Not Panagram");
	}


	

}







