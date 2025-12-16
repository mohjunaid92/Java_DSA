package patterns;

public class o1_Triagle {

    public static void o1Pattern(int n){
        // outer loop
        for(int i = 1; i<= n; i++){
            //Inner loop 
            for(int j = 1; j<= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        o1Pattern(5);
       
    } 
    
}
