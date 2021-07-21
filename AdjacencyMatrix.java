package sdot;
import java.util.Scanner;
public class AdjacencyMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,columns;
		
		System.out.println("Enter the rows and columns:");
		rows=sc.nextInt();
		columns=sc.nextInt();
		int zero=0;
		
		int adj[][]=new int[rows][columns];
		
		for(int i=0;i<rows;i++){
			for(int j=0;i<columns;i++){
				adj[i][j]=zero;
			}
		}
		printAdjMatrix(adj,rows,columns);
		
		System.out.println("Enter the number of edges:");
		int edges=sc.nextInt();
		int snode,enode,weight;
		
		String isdirected;
		System.out.println("is the graph is directed(capital):");
		isdirected=sc.next();
		
		if(isdirected=="YES") {
			System.out.println("Enter the starting node and end node and weigth of the edge:");
			for(int i=0;i<edges;i++) {
				snode=sc.nextInt();
				enode=sc.nextInt();
				weight=sc.nextInt();
				adj[snode][enode]=weight;
			}
			printAdjMatrix(adj,rows,columns);
		}else {
			for(int i=0;i<edges;i++) {
				snode=sc.nextInt();
				enode=sc.nextInt();
				weight=sc.nextInt();
				adj[snode][enode]=weight;
				adj[enode][snode]=weight;
			}
			printAdjMatrix(adj,rows,columns);
		}
		sc.close();

	}

	public static void printAdjMatrix(int[][] adj,int rows,int columns) {
		for(int i=0;i<rows;i++){
			for(int j=0;i<columns;i++){
				System.out.print(adj[i][j]);
			}
		}
	}

}
