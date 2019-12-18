package com.java.collection.array;

public class ArrayReverseInGroups {

	   
    // Function to reverse every sub-array formed by 
    // consecutive k elements 
    static void reverse(int arr[], int n, int k) 
    { 
        for (int i = 0; i < n; i += k) 
        { 
            int left = i; 
            
            System.out.println("left: "+left);
      
            // to handle case when k is not multiple 
            // of n 
            int right = Math.min(i + k - 1, n - 1);
            
            System.out.println("i + k - 1: "+(i + k - 1));
            
            System.out.println("n-1: "+(n-1));
            
            System.out.println("right: "+right);
            int temp; 
              
            // reverse the sub-array [left, right] 
            while (left < right) 
            { 
            	temp=arr[left]; 
                arr[left]=arr[right]; 
                arr[right]=temp; 
                left+=1; 
                right-=1; 
                System.out.println("right: "+right);
            } 
        } 
    } 
      
    // Driver method 
    public static void main(String[] args) 
    { 
          
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
        int k = 3; 
      
        int n = arr.length; 
      
        reverse(arr, n, k); 
      
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 

}
