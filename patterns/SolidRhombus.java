package patterns;

public class SolidRhombus {
    public static void HollowRombas(int n){
        // 
        for(int i = 1; i<= n; i++){
            // spaces
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }

            // Hollow ractangle

            for(int j = 1; j<= n; j++){
                if(i == 1|| i==n || j ==1|| j== n){
                    System.out.print("*");
                
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        
        // solid rombus
        int n = 5;
        HollowRombas(n);

        for(int i = 1; i<= n; i++){
            // spaces 

            for(int j= 1; j<= n-i; j++){
                System.out.print(" ");
            }

            // starts

            for(int j = 1; j<= n; j++){
                System.out.print("*");
            }

            System.out.println();


        }




    }

    
}
