public class BubbleSort {
    public static void BubbleSort1(int arr[]){
        
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         
        }

    }
    public static void Print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr1[] = {5,4,2,3,0,8,7,6,3,9,14,2,1,5,4};
        BubbleSort1(arr);
        Print(arr);
        
    }
}