package strings;
public class VowelsConsonentsInString {
	public static void main(String[] args) {
		String str="Hello i am Chukka PRASAD .";
		int vCount=0,cCount=0,space=0;
		int l=str.length();

		for(int i=0;i<l;i++) {
			if(str.charAt(i)==' ')
				space++;
			
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||
					(str.charAt(i)=='o')||(str.charAt(i)=='u')) {
				vCount++;//counting vowels
			}
			else{
				if((str.charAt(i)>'a')&&(str.charAt(i)<='z'))
					cCount++;//counting consonants	
			}
		}
		System.out.println("The String is :		"+str);
		System.out.println("The Vowels are :	"+vCount);
		System.out.println("The Consonent are :	"+cCount);
		System.out.println("The Spaces are :	"+space);
	}

}
