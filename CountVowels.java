import java.util.Scanner;
class CountVowels{

        public static int countVowelsNewApproach(String s){
 		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>=97 && ch<=122)
				ch=(char)(ch-32);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				count++;
		}
		return count;
	}

	public static int countVowelsByUsingForLoop(String s){
                s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++){
                     char ch=s.charAt(i);
		     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			count++;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
 		String s=sc.nextLine();
	//	int vowels=countVowelsByUsingForLoop(s);
		int vowels=countVowelsNewApproach(s);
		System.out.println("No of vowels in "+s+" are = "+vowels);
	}


}