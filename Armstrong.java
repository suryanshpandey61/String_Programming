class Armstrong{
	public static void checkArmStrong(int n){
		int m=n;
		int sum=0;
		while(n>0){
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(sum==m)
			System.out.println("Yes"+sum);
		else
		 	System.out.println("No"+sum);

	}

	public static void main(String[] args){
		checkArmStrong(163);
	}

}