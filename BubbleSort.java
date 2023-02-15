public class BubbleSort{

    public static void Sort(int arr[]){
        for(int turn=0 ; turn<arr.length-1; turn++){
            int swaps = 0;
            for(int j=0; j<arr.length-1-turn ; j++){
                if( arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;

                }
            }
            System.out.println(swaps);
        }

    }

    public static void Print(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,4,5,6};
        Sort(arr);
        Print(arr);
    }
}