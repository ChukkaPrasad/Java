package patterns;

public class pattern2 {

	public static void main(String[] args) {
		int len=9;
		int s=len-1;
		for(int i=1;i<=len;i++) {
			for(int j=s;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		int spc=1;
		for(int i=len-1;i>=1;i--) {
			for(int j=1;j<=spc;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			spc++;
			System.out.println();
		}
	}
}
