package patterns;


public class FloyedsPattern {

    public static void FloyedsPattern(int n){
        // Outer loop
        int val = 1;
        for(int i = 1; i<= n; i++){
            //inner loop
            for(int j = 1; j<= i; j++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        FloyedsPattern(5);


    }
    
}
