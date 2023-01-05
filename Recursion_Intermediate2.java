
public class Recursion_Intermediate2 {
// Q-> Find the first and last Occurrence of an element in String
	// example "abaacdsafaah"  elemnet = a
	//  first occurrence of element 'a' at index 1
	//  last occurrence of element 'a' at index 10
	
  public static int first =-1;// we declared first as constant
  public static int last = -1;// same for last
 
   public static void findOccur(String str, int idx, char element) {
	  
	   if(idx==str.length()) {
		   return;
	   }
	   char currentChar = str.charAt(idx);
	   if(currentChar==element) {
		   if(first==-1) {
			   first =idx;
		   }
		   else {
			   last = idx;
		   }
	   }
	   findOccur(str,idx+1,element);
	   
   }
   
   public static void main(String args[]) {
	   String str = "abaacdsafaah";
	   char element = 'a';
	   findOccur(str,0,element);
	   System.out.println("First Occurrence: "+ first);
	   System.out.println("Last Occurrence: "+ last);
   }
}

