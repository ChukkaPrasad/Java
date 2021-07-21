package strings;
import java.util.Arrays;
public class StringAnagramSameString {
	public static void main(String[] args) {	
	//checking two strings having same string characters
		String one="Hello iam prasad";
		String two="Dasarp mai olleh";
		
		if(one.length()!=two.length()) {
			System.out.println("THIS IS NOT A  ANAGRAM.");
		}
		else {	
			one=one.toUpperCase();//java is case sensitive
			two=two.toUpperCase(); 
			
			char[] string1=one.toCharArray();//chars to string array
			char[] string2=two.toCharArray();

			Arrays.sort(string1);//sorting the array
			Arrays.sort(string2);
			
			if(Arrays.equals(string1,string2)==true) {
				System.out.println("THIS IS A ANAGRAM.");
			}else {
				System.out.println("characters are not match");
			}
			
		}
		
	}

}
