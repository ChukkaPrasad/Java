package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--) {
			
			int s=5;
			for(int j=1;j<=5;j++) {
				if(j<=i)
					System.out.print(s);
				else 
					System.out.print(" ");
				s--;	
			}
			
			int d=1;
			for(int j=5;j>=1;j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(d);
				d++;
			}
			
			System.out.println();
		}
	}

}
