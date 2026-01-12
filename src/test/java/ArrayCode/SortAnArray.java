package ArrayCode;

public class SortAnArray {

	public static void main(String[] args) {
		
    int arr[]= {7,8,4,3,9,5,7,8,2};
    int temp=0;
    
 
            
            // Sorting using simple nested loops (Selection sort style)
            for(int i = 0; i < arr.length; i++) {
                for(int j = i+1; j < arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            
            // Print sorted array
            System.out.println("Sorted Array:");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

