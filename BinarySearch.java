class BinarySearch{
	
	public static int getElement(int[] a,int ele){
		int si=0;  int ei=a.length-1;
		
		for(int i=si;i<=ei;i++){
			int mid=(si+ei)/2;
			if(ele==a[mid])
				return mid;
			else if(ele>a[mid]){
				si=mid+1;	
			}
			else{
				ei=mid-1;	
			}
	
		}
		return -1;
	}

	public static void main(String[] args){
		int[] a={10,20,30,40,50,60,70,80};
		System.out.println(getElement(a,70)); 
	}

}