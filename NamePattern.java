package patterns;

public class NamePattern {

	public static void main(String[] args) {
		System.out.println("PATTERN 'C' :");
		
		int len=10,col=(len/2)+1;
		int x=0,y=col;
		for(int i=1;i<=len;i++) {
			++x;
			for(int j=1;j<=col;j++) {
				if(i==x&&j==y)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			if(x>(len/2)-1)
				y++;
			else
				y--;
			System.out.println();
		}
	
	System.out.println("PATTERN 'V' :");
		
		int leng=10,colm=len*2-1;
		int start=1,end=colm,update=1;
		for(int ii=1;ii<=leng;ii++) {
			for(int j=1;j<=colm;j++) {
				if(ii==update&&j==start||ii==update&&j==end)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			start++;
			end--;
			update++;
			System.out.println();
		}
		
	System.out.println("PATTERN 'P' :");
	
		int l=10,c=l-1;
		for(int k=1;k<=l;k++) {
			for(int j=1;j<=c;j++) {
				if(j==1||k==1||k==3||k==2&&j==l-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
