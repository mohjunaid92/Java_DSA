public class Setithbit {
    public static void setithBit(int n, int i){
        int bitmask = 1<< i;
        System.out.println(n | bitmask);
    }
    public static void main(String[] args) {
        setithBit(10, 2);
        
    }
}
