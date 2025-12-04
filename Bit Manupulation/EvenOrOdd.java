public class EvenOrOdd {
    public static void EvenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        EvenOrOdd(16);
        EvenOrOdd(7);
        EvenOrOdd(3);
        
    }
}
