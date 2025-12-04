public class cleariBits {
    public static void clearithBit(int i, int n){
        int bitmask = (~0)<<i;
        System.out.println(n&bitmask);
    }
    public static void main(String[] args){
        clearithBit(2, 15);

    }
    
}
