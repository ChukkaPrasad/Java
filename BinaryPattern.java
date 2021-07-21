package patterns;

public class BinaryPattern {

	public static void main(String[] args) {
		 int len=10;
		    for(int i=1;i<=len;i++){
		        for(int j=1;j<=i;j++){
		            
		            if((i%2==0)&&(j%2==0))
		                System.out.print(1);
		            else if((i%2!=0)&&(j%2!=0))
		                System.out.print(1);
		            else
		                System.out.print(0);
		        }
		        System.out.println();
		    }
	}

}
