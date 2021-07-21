package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		char c='A';
		int len=6;
		int space=len-1;
		for(int i=0;i<=len;i++) {
		
			for(int j=space;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(c+" ");
			}
			System.out.println();
			c++;
		}
		
		//other pattern
		//this pattern looks like printed pattern only
		int count=1;
		for(int i=0;i<len;i++) {
			for(int j=space;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}System.out.println();
		}
		
	}

}
