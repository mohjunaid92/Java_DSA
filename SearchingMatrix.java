public class SearchingMatrix {
    //optimize search
    public static boolean matrixSearch(int arr[][], int key){
       int row = arr.length-1;
       int col = 0;
        while(row >= 0 && col<= arr[0].length-1){
            if(key == arr[row][col]){
               return true;
            } else if(key > arr[row][col]){
                col++;
            } else {
                row--;
            }
        }
      return false;
        
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                       int key = 11;

                     System.out.println(matrixSearch(arr, key)); 
    }
}
