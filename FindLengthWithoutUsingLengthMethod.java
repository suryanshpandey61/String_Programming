import java.util.Scanner;
class FindLengthWithoutUsingLengthMethod{

  public static int getLengthUsingWhileLoopAndNullCharacter(String s){
        s=s+'\0';
        int i=0;
        while(s.charAt(i)!='\0'){
            i++;
	}
 	return i;
  }

  public static int getLengthUsingNullCharacter(String s){
      s=s+'\0';
      return s.indexOf('\0');
  }


  public static int getLengthByUsingCharArrayMethod(String s){
       char[] ch=s.toCharArray();
       return ch.length;
  }
  
   public static int getLength(String s){
        int length=0;
	try{
	    for(int i=0;;i++){
                       s.charAt(i);
                       length++;
	    }
        }catch(Exception e){
	 }
	return length;
   }

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string:");
      String s1=sc.nextLine();
      
          int length=getLengthUsingWhileLoopAndNullCharacter(s1);
    //    int length=getLengthUsingNullCharacter(s1);
    //  int length= getLengthByUsingCharArrayMethod(s1);      
    //  int length=getLength(s1);
      System.out.println("The length of "+s1+ " is = "+length);
   }


}