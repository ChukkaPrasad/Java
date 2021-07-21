package strings;

public class CountCharactersInString {

	public static void main(String[] args) {
		
		int count=0;
		String str="Hi my Name is Chukka Prasad";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')//removing spaces from the string so that we can find only chars
				count++;//counting is based on the condition
		}
		
		System.out.println("The String is : "+str);
		System.out.println("The String Length is : "+str.length());
		System.out.println("The Number of Characters in the String is : "+count);
		
	}

}
