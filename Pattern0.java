package patterns;

public class Pattern0 {

	public static void main(String[] args) {
		int len=5;
		for(int i=1;i<=len;i++){
	        int pr=len;
	        for(int j=1;j<=i;j++){
	            System.out.print(pr);
	            pr--;
	        }
	        System.out.println();
	    }
	}

}
