public class Practice {
    public static void EvenOrOdd(int n ){
        int bitmask = 1;
        if((n & 1) != 0){
            System.out.println("odd");

        } else {
            System.out.println("Even");
        }
    }
    // Set ith bit

    public static void setIthBit(int i,int n){
        int bitmask = 1<<i;
        System.out.println(n | bitmask);
    }
    // set ith bit 
    public static void getithbit(int n, int i){
        int bitmask = 1<<i;
       if((n & bitmask) != 0){
        System.out.println("ith bit is 1");
       } else {
        System.out.println("bit is 0");
       }
    }
    // clear ith bit 
    public static void clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        System.out.println(n & bitmask);
    }
    public static void updateithbit(int n, int i){
        int bitmask = 1<<i;
        System.out.println(n ^ bitmask);
    }
    public static void main(String args[]){
        int n = 5;
        EvenOrOdd(n);
        setIthBit(2, n);
        getithbit(n, 2);
        clearithbit(n, 2);
        updateithbit(n, 2);

    }
}