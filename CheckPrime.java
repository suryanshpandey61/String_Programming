import java.util.Scanner;
class CheckPrime{
	public static void checkPrime(int n){
		int count=0;
		int i=1;
		while(i<=n){
			if(n%i==0)
				count++;
		i++;
		}
		if(count==2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		checkPrime(n);
	}
}