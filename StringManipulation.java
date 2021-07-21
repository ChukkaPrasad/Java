package stringManipulation;

public class StringManipulation {

	public static void main(String[] args) {
		
	/* object, String class, heap memory allocation, immutable strings(will not change after string allocation)
	 * string pool,string buffer,builder(mutable strings),
	 * char array, string array, runtime polymorphism ,methods
	 * string creation (normal or literal or interned)or(with new keyword)
	 * */
		String str1="Prasad";
		String str2="Prasad";//equal

	/*both str1 and str2 are reference variables pointing to the same literal :- "Prasad"
	 *  we are not comparing content ex:- Prasad.
	 * we are comparing hash codes in str1 and str2 which will be same for the string prasad
	 * */		
		if(str1==str2) {
			System.out.println("str1 == str2");
		}else {
			System.out.println("str1 != str2");
		}
		System.out.println();

	/* string object using new keyword
	 * string object is constructed in "heap area" with Prasad as its contents
	 * str3 and str4 are reference variables which are pointing to 2 different objects whose content is same
	 * */
		String str3=new String("Prasad");
		String str4=new String("Prasad");//not equal

	/* we are not comparing content ex:Prasad
	 * we are comparing "hash codes" in str3 and str4 which will be different for the string object containing Prasad
	 * */
		if(str3==str4) {
			System.out.println("str3 == str4");
		}else {
			System.out.println("str3 != str4");
		}
		System.out.println();

	/* we have compared hash codes up to now towards reference variable
	* Now it is time to compare content with in the reference variable
	* */
		
	//	ACTUAL COMPARISION STARTS.....!
		
	//equals(): we can check equals str1,str2,str3,str4
		
		if(str1.equals(str3)) {
			System.out.println("str1 is equal to str3");
		}else {
			System.out.println("str1 is not equal to str3");
		}
		System.out.println();

		//compareTo(): we can compare chars in both common 
		
		if(str1.compareTo(str3)==0) {
			System.out.println("str1 is compared to str3");
		}else {
			System.out.println("str1 is not compared to str3");
		}
		System.out.println();

	//String methods
		String str="Prasad, Praveen, Prakash, piyush";//it is a string kind a long
		System.out.println("string is: "+str);
		System.out.println();
		
		int l=str.length();
		System.out.println("string length is: "+l);
		System.out.println();

	// printing chars at particular position
		System.out.println("first character of string: "+str.charAt(0));
		System.out.println("fifth character of string: "+str.charAt(4));
		System.out.println("last character of string: "+str.charAt(l-1));
		System.out.println();

	//printing all string as upper case and lower case letters
		System.out.println("The Upper case letters: "+str.toUpperCase());
		System.out.println("The Lower case letters: "+str.toLowerCase());
		System.out.println();

	//contains()
		if(str.contains("Prasad")) {//case sensitive
			System.out.println("prasad is in the string");
		}
		System.out.println();

	//substring()
		String sub1=str.substring(5);
		System.out.println("the substring is: "+sub1);
		String sub2=str.substring(1,10);
		System.out.println("the substring is: "+sub2);
		System.out.println();

	//replace()	
		String rp=str.replace("P", "K");
		System.out.println("the replaced string is : "+rp);
		System.out.println();

	//char[] array - toCharArray()
		char[] chars=str.toCharArray();
		for(char i:chars) {
			System.out.print(i+"|");
		}
		System.out.println();
		System.out.println();
		
	//String[] array - split()
		String[] nameArr=str.split(",");
		for(String s:nameArr) {
			System.out.println(s);
		}System.out.println();
		
	//String[] array - trim()
		for(String s:nameArr) {
			System.out.println(s.trim());
		}
		System.out.println();

		
	//validation using the isEmpty();
		String name="Prasad";
		String paswd="11245";
		String email="prasad.chukka@viap.ac.in";
		String phone="97546989";
		
		if(!name.isEmpty()) {
			System.out.println("name is available: "+name);
		}else {
			System.out.println("pleas fill the name string: "+name);
		}
		
		if(!paswd.isEmpty()) {
			System.out.println("password is available ");
		}else {
			System.out.println("pleas fill the password string");
		}
		
		if(!email.isEmpty()) {
			System.out.println("email is available: "+email);
			if(!(email.contains(".")&&!(email.contains("@")))) {
				System.out.println("you have entered valid email: "+email);
			}else {
				System.out.println("please fill valid email: "+email);
			}
		}else {
			System.out.println("pleas fill the email string: "+email);
		}
		
		if(!phone.isEmpty()) {
			if(phone.length()!=10) {
				System.out.println("plese enter valid phone number: "+phone);
			}else {
				System.out.println("you have enterd phone number successfully: "+phone);
			}
		}else {
			System.out.println("pleas fill the phone number: "+phone);
		}
		System.out.println();
		
	//IMMUTABLE AND MUTABLE STRINGS
		String ss=new String("Prasad");
		ss.concat("chukka");//not added
		//we can not modify it but we can use it another place
		//String q=ss.substring(3);
		//System.out.println(q);
		System.out.println("The Immutable String is: "+ss);
		
		StringBuffer buffer=new StringBuffer("Prasad");
		buffer.append("chukka");
		System.out.println("the String BUffer String is: "+buffer);
	
		StringBuilder builder=new StringBuilder("Prasad");
		builder.append("chukka");
		System.out.println("the string builder string is: "+builder);
		System.out.println();

	/*	RunTime Polymorphism - Runtime polymorphism or Dynamic Method Dispatch is a process 
	 *	in which a call to an overridden method is resolved at runtime rather than compile-time.
	 *	In this process, an overridden method is called through the reference variable of a superclass. 
	 *	The determination of the method to be called is based on the object being referred to by the reference 
	 *	variable */
		System.out.println("RUN TIME POLYMORPHISM:");
		CharSequence cs=null;
		
		cs=new String("Hello");	//creating a instance
		System.out.println(cs);

		cs=new StringBuffer("prasad");//overriding the string
		System.out.println(cs);

		cs=new StringBuilder("Bye");//overriding the buffer
		System.out.println(cs);

	}

}
