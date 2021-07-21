package searchAndSort;
		// selection sort is better than Bubble sort
public class selectionSort {// here we swapping the minimum element to the first of the array

    public static void main(String args[])  
    {  
        int temp;  
        int arr[]= {2,5,3,4,8,9,1,3,6};//array
        
        for(int i=0; i<arr.length; i++)  //sorting all the elements 
        {  
            for(int j=i+1; j<arr.length; j++)  
            {  
                if(arr[i] > arr[j])  //compare the all the elements and swap the min element to the first element.
                {  
                    temp = arr[i];  
                    arr[i] = arr[j]; //swapping element to the first
                    arr[j] = temp;  
                }  
            }  
        }  //BEST OF ALL SORTS
          
        System.out.print("Now the Array Sorting is :\n");  
        
        for(int i=0; i<arr.length; i++)  
        {  
            System.out.print(arr[i]+ "  ");  
        }  
    }  
	
 // ANOTHER WAY OF SORTING SELECTION SORT
    
	/*
	public static void sElectionSort(int[] arr)//array initialized
	{  
        for (int i = 0; i < arr.length - 1; i++)  //checking the array 
        {  
            int index = i; //swapping variable index assigned i value
            
            for (int j = i + 1; j < arr.length; j++){  //swapping the all elements and swap to the min element to the first position 
            	
                if (arr[j] < arr[index]){  //checking the i value with the other elements
                	
                    index = j; //if true we save those element into the index as a min temp variable
                }  
            }  
            
            int smallerNumber = arr[index];   //the swapping process begin
            
            arr[index] = arr[i];//swapping the elements   
            
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
    	
        int[] arr1 = {9,14,3,2,43,11,58,22};
          
        sElectionSort(arr1); //sort the elements

        for(int i:arr1){  //display sort
            System.out.print(i+" ");  
        }  
    }  */
    
    
   

}
