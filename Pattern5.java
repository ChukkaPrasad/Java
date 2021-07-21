package patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int len=7;
		for(int i=len;i>0;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=len;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//other pattern
				int l=7;
				for(int i=1;i<=l;i++) {
					for(int j=1;j<=l/2;j++) {
						if(i==(j-2)||j==(i-2))
							System.out.print("*");
						else if((i%2==0)&&(j%2==0))
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
		
	}

}
