package patterns;

public class InvertedHlfPeramidWithNo {
    public static void half_Peramid_With_No(int totrow, int totcol){
        for(int i = 1; i<= totrow; i++){
            for(int j = 1; j<= totcol- i +1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        half_Peramid_With_No(5, 5);
    }
    
}
