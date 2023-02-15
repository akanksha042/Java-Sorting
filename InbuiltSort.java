import java.util.*;

public class InbuiltSort {
    public static void Print(Integer arr[]){
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        Integer arr[] = {5,4,1,3,2};
        
        
         //Arrays.sort(arr, starting index, ending index);
         Arrays.sort(arr,2,5);
         Print(arr);
         //inbuilt sort function 
        Arrays.sort(arr);
        Print(arr);
         //reverse sort karne ke liye we will use java.util.collections
         Arrays.sort(arr,0,2,Collections.reverseOrder());
         Print(arr);
        //reverse sort karne ke liye we will use java.util.collections
        Arrays.sort(arr,Collections.reverseOrder());
        Print(arr);
       
    
}}
