

public class xPowerx {
    public static int power(int n){
        int pow = 1;
        for(int i = 1; i<=n; i++){
            pow = pow*n;
        }
        return pow;
    }
    public static int complement(int n){
        int bitmask = (~0);
        int result = n^ bitmask;
        return bitmask;
    }
    public static void main(String args[]){
        System.out.println(power(5));
        System.out.println(complement(5));

    }
    
}
