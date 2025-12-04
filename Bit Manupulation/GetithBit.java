public class GetithBit {
    public static void getIthbit(int i ,int n){
        int bitmask = (1<< i);
        if((n & bitmask) != 0){
            System.out.println("ith bit is 1");
        }else {
            System.out.println("ith bit is 0");
        }
    }
    public static void main(String args[]){
        getIthbit(2, 10);

    }
    
}
