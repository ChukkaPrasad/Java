package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int len=5;
		
		for(int i=1;i<=len;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1)
					System.out.print(j+" ");
				else if (i==len)
					System.out.print(j+" ");
				else if(i==j)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
			// other pattern
			int space=len-1;
		for(int ii=1;ii<=len;ii++) {
			for(int j=space;j>=ii;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=ii;j++) {
				if(j==1)
					System.out.print(j+" ");
				else if (ii==len)
					System.out.print(j+" ");
				else if(ii==j)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
