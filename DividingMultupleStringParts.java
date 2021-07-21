package strings;
public class DividingMultupleStringParts {
	public static void main(String[] args) {
		
		//dividing string into three equal parts
		String str="CHUKKA VARA PRASAD";
		int n=3;
		int l=str.length();
		int part_len=l/n;
		
		String [] subString=new String[n];
		int p=0;
		
		if(l%n!=0) {
			System.out.println("This String can't be divided Equally.");
		}
		else {
			System.out.println("The Equal parts:");
			
			for(int i=0;i<l;i=i+part_len) {	//making substring of part length elements
				subString[p]=str.substring(i,i+part_len);//storing in an array
				p++;//moving to next element
			}
			for(String i:subString) {
				System.out.println(i);//prints subsets
			}
		}
	}
}