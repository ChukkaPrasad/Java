package searchAndSort;
//the binary search is faster than linear search(search every position entire loop) 
public class BinarySearch {//here i am avoiding the linear search and try to focus on binary search
	//binary search is best of all searching algorithms
	public static int binarySearch(int arr[], int first, int last, int key){  
		 //divide the array and search
	  if (last>=first)
	  {
		  int mid = first + (last - first)/2;  //divide the array into two parts
        
		  if (arr[mid] == key) //if key founds at direct mid
			  return mid;  
        
		  if (arr[mid] > key) //key appears in low of the mid array
			  return binarySearch(arr, first, mid-1, key);
		  else  
			  return binarySearch(arr, mid+1, last, key);//key appears high of the mid array     
        }  
	        
	  return -1;  
	}  // BEST OF ALL SEARCH
	 
	public static void main(String args[]){  
		
		int arr[] = {10,20,30,40,50};  //array
		
		int key = 30;  //key
		
		int last=arr.length-1; //last element from 0 to length-1
		
		int result = binarySearch(arr,0,last,key);  //instance of the object
		
		if (result == -1)  
		    System.out.println("Element is not found!");  
		else  
		    System.out.println("Element is found at index: "+result);  
	}  
}
