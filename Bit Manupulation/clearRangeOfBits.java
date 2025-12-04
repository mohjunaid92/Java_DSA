public class clearRangeOfBits {
    public static void clearInRange(int i, int j, int n){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmaks = a|b;
        System.out.println(n & bitmaks);
    }
    public static void main(String[] args) {
        clearInRange(2, 4, 10);
        
    }
}
