import java.util.Scanner;
class Program9{
	
	public static void replaceByUsingReplaceMethod(String s){
		for(int i=0;i<s.length();i++){
			s=s.replace(' ','_');
		}
		System.out.println(s);
	}

	public static void replaceWithoutUsingReplaceMethod(String s){
		char[] new_s=s.toCharArray();
		for(int i=0;i<new_s.length;i++){
			
			if(new_s[i]==' ')
				new_s[i]='_';
		}
		System.out.println(new_s);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string :");
		String s=sc.nextLine();
                // replaceByUsingReplaceMethod(s);
		replaceWithoutUsingReplaceMethod(s);
	}
	
}