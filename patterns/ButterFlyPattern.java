package patterns;
public class ButterFlyPattern {

    //Butterfly pattern
    public static void ButterFly(int n){
        // Outer loop
        //first half
        for(int i = 1; i<= n; i++){
            // Inner loop for starts

            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            //Stars

            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
         for(int i = n; i>=  1; i--){
            // Inner loop for starts

            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            //Stars

            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        ButterFly(4);    

    }

}