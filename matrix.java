package sdot;

public class matrix {

	public static void main(String[] args) {
		int n=3;
		int f[][]={{1,2,3},{0,1,4},{5,6,0}};    
		int s[][]={{-1,0,1},{2,0,2},{3,3,3}};    
		    
		System.out.println("ADDING:"); 
		int mat[][]=new int[3][3];  
		 int mul[][]=new int[3][3]; 
		 for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
				         
				mat[i][j]=f[i][j]+s[i][j];  
				System.out.print(mat[i][j]+" ");
				}  
				System.out.println();
		 }
		 
			System.out.println("=============="); 
			System.out.println("MULTIPLYING:"); 
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		mul[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		mul[i][j]+=f[i][k]*s[k][j];      
		} 
		System.out.print(mul[i][j]+" "); 
		}
		System.out.println();
		} 
		
		int i, j;
		float adet = 0;
	
		System.out.println(" ");
	    for(i = 0; i < 3; i++)
	        adet = adet + (mat[0][i] * (mat[1][(i+1)%3] * mat[2][(i+2)%3] - mat[1][(i+2)%3] * mat[2][(i+1)%3]));
		
		System.out.println("\ndeterminant = " + adet);
				
		System.out.println("\nInverse of Addition matrix is:");
		for(i = 0; i < 3; ++i) {
			for(j = 0; j < 3; ++j)
				System.out.print((((mat[(j+1)%3][(i+1)%3] * mat[(j+2)%3][(i+2)%3]) - (mat[(j+1)%3][(i+2)%3] * mat[(j+2)%3][(i+1)%3]))/ adet) + " ");
			
			System.out.print("\n");
		}
		System.out.println(" ");
		float mdet = 0;
	
		
	    for(i = 0; i < 3; i++)
	        mdet = mdet + (mul[0][i] * (mul[1][(i+1)%3] * mul[2][(i+2)%3] - mul[1][(i+2)%3] * mul[2][(i+1)%3]));
		
		System.out.println("\nDeterminant = " + mdet);
				
		System.out.println("\nInverse of Multiplication matrix is:");
		for(i = 0; i < 3; ++i) {
			for(j = 0; j < 3; ++j)
				System.out.print((((mul[(j+1)%3][(i+1)%3] * mul[(j+2)%3][(i+2)%3]) - (mul[(j+1)%3][(i+2)%3] * mul[(j+2)%3][(i+1)%3]))/ mdet) + " ");
			
			System.out.print("\n");
		}
		
		}
}