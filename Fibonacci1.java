import java.util.Scanner;
class Fibonacci1{
	
	public static int getFib(int n){
		if(n==0)
			return 0;
		else if(n==1 || n==2)
			return 1;
		else
			return getFib(n-1)+getFib(n-2);
	}
	

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sequence");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int value=getFib(i);
			System.out.print(value+" ");
		}
	}

}
