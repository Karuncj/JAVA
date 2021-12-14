/*******************************************************************************
 *File Name		:StringPalindrome.java
 *Description	:Program to check whether the given string is palindrome or not 
 * Author		:Karun Chery James
 * Date			:3/12/2021
/ *****************************************************************************/
import java.util.*;
public class StringPalindrome {
 public static void main(String [] args) {
	 String str;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string to check palindrome");
	 str=sc.next();
	 System.out.println("Entered string="+str);
	 palindrome pal=new palindrome();
	 pal.checkPalindrome(str);
	 sc.close();
 }
}
class palindrome{
	void checkPalindrome(String st){
		int length,count=0;
		length=st.length();
		for(int i=0;i<length-1;i++) {
			if(st.charAt(i)==st.charAt(length-i-1)) {
				count++;
			}
		}
		if(count==length-1) {
			System.out.println("The given string "+st+" is palindrome");
		}
		else {
			System.out.println("The given string "+st+" is not palindrome");	
	}
}
}
