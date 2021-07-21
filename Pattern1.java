package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int len=10;
	    for(int i=1;i<=len;i++){
	        
	        for(int j=1;j<=i;j++){
	            System.out.print(j);
	        }
	        for(int j=len-1;j>=i;j--){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

}
