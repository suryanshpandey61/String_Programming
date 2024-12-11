import java.util.Scanner;
class StarPatter{
	
	public static void getPattern(int n){
		int star=1;
		int space=n-1;
		for(int j=1;j<=n;j++){
			for(int i=1;i<=space;i++){
				System.out.print("  ");
			}
			for(int i=1;i<=star;i++){
				System.out.print("*   ");
			}
			star++;
			space--;
			System.out.println();
		}
		
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		getPattern(n);
	}
	
}