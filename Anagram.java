import java.util.Scanner;
class Anagram{

	public static int[] getFreqArray(String s){
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90){
				freq[ch-65]++;
			}
			else if(ch>=97 && ch<=122){
				freq[ch-97]++;
			}
		}
		return freq;
	}

	public static boolean checkAnagram(String s1,String s2){
                int[] freq1=getFreqArray(s1);
		int[] freq2=getFreqArray(s2);
		for(int i=0;i<freq1.length;i++){
			if(freq1[i]!=freq2[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String:");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String:");
		String s2=sc.nextLine();
		boolean res=checkAnagram(s1,s2);
		if(res)
			System.out.println("The two Strings are Anagram of Each other");	
		else
			System.out.println("The two Strings are Not Anagram of Each Other");
		
	}

}






