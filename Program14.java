import java.util.Scanner;
class Program14{
	
	public static void removeDuplicate(String s){
 	 s=s.toUpperCase();
     	 char[] freq = new char[26];
	 for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		freq[ch-65]++;
	 }  
	
	for(int i=0;i<freq.length;i++){
		System.out.println(freq[i]);
	}	
			
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		removeDuplicate(s);
	}
}