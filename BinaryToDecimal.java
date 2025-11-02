package Java_DSA;

public class BinaryToDecimal {
    public static double DecimalToBinary(int n){
        int pow = 0;
        double BinNum = 0;
        while(n>0){
            int rem = n%2;
            BinNum =BinNum + rem*Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        return BinNum;
    }
    public static void main(String args[]){
        System.out.println(DecimalToBinary(4));

    }
    
}
