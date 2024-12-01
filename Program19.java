import java.util.Scanner;
class Program19{

	public static String printReverseWord(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return rev;
	}

        public static String wordReverse(String s){
		String new_rev="";
  		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch!=' ' && s.charAt(i-1)==' '){
				new_rev=ch+new_rev;
			}
		}
		return new_rev;
	}

	

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string:");
		String s=sc.nextLine();
		String rev=printReverseWord(s);
		String new_rev=wordReverse(rev);
		System.out.println(new_rev);
	}

}