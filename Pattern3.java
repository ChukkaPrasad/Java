package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		int len=15;
		for(int i=0;i<=len;i++) {
			char s='A';
			int space=len-1;
			
			for(int j=space;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print(s+" ");
				s++;
			}
			System.out.println();
		}
	}

}
