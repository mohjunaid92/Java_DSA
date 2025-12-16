package patterns;

public class RotatedHlfPeramid {

    public static void Peramid_with_No(int n) {
        // Outer loop
        for(int i = 1; i<= n; i++){
            // inner loop
            for(int j = 1; j<= n-i+1; j++){
                System.out.print(j);
            }

            //next line
            System.out.println();
        }

    }
    

    
    public static void main(String[] args){
        Peramid_with_No(5);
       // Inverted rotated half peramid
       //outer loop
       int n = 4;
       for(int i = 1; i<= n; i++){

        // inner loop for spaces
           for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
            }
        
        // loop for stars
            for(int j = 1; j<= i; j++){
            System.out.print("*");
            }
        

        //next line

        System.out.println();

       }
    }
}