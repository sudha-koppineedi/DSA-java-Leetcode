import java.util.Arrays;
public class basicSorting {

    public static void bubbleSort(int arr[]){ //O(n*n)
        int swaps =0;
        int n = arr.length;
        for(int i=0; i<n-1; i++){ //turns
            swaps=0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }

            if(swaps == 0){ //TC = O(n)
                break;
            }
        }
        
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j=i+1; j<n; j++){ // finding minimum
                if(arr[minPos] > arr[j]){
                minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
     int n = arr.length;

     for (int i = 1; i < n; i++) {
          int curr = arr[i];
         int prev = i - 1;

          while (prev >= 0 && arr[prev] > curr) {
            arr[prev + 1] = arr[prev]; // shift
            prev--;
          }

          arr[prev + 1] = curr; // insert
        }
    }

    public static void countingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    int n = arr.length;

    // find largest element
    for (int i = 0; i < n; i++) {
        largest = Math.max(largest, arr[i]);
    }

    // count array
    int count[] = new int[largest + 1];

    // frequency count
    for (int i = 0; i < n; i++) {
        count[arr[i]]++;
    }

    // sorting
    int j = 0;  //j is the index of original array
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
}




    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = { 5, 4, 1, 3, 2};
        countingSort(arr);
        // Arrays.sort(arr);
        printArr(arr);
    }
    
}
