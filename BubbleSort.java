package searchAndSort;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		int temp=0;//for swapping a temp variable
		
		for(int i=0;i<n;i++) {//5 1 7 2 3 9 5 4 search all elements in the array
			for(int j=1;j<n-i;j++) {//i value search element of remaining n-i  
				if(arr[j-1]>arr[j]) {//if the element[0] is greater than next element[1]
					temp=arr[j-1];//swap the max element[0] to the temp
					arr[j-1]=arr[j];// min element[1] to the first position[0]
					arr[j]=temp;//temp[0] stored in next element position[1]
				}
			}//is slower than selection sort so go for selection sort
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {5,1,7,2,3,9,5,4};
		
		bubbleSort(arr);	
		
		for(int i=0;i<arr.length;i++)//display the sorted array
			System.out.print(arr[i]+" ");
		
	}

}
