class BubbleSort{
		
	public static void bubbleSort(int[] a){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			int x=0;
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					x++;	
				}
			}
			if(x==0)
				break;
		}
	}

        public static void printArray(int[] a) {
     		   for (int i = 0; i < a.length; i++) {
        		    System.out.print(a[i] + "  ");
      		   }
        	System.out.println();  // Print a newline for readability
        }

	public static void main(String[] args){
		int[] a={12,3,3,21,4,55,33,21};
		bubbleSort(a);
                System.out.print("Sorted array:");
                printArray(a);
	}
	
}