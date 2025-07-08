import java.util.Scanner;

public class BitOperations{
    static int getBit(int n, int i){
        return ((n & (1 << i)) > 0) ? 1 : 0;
    }
    static int setBit(int n, int i){
        return (n | (1 << i));
    }
    static int clearBit(int n, int i){
        return (n & (~(1 << i)));
    }
    static int updateBit(int n, int i, int sN){
        if(sN==1){
            return setBit(n, i);
        }else{
            return clearBit(n, i);
        }
    }
    static int clearLastIBits(int n, int i){
        return n & ((~0) << i);
    }
    static int clearRangeOfBits(int n , int st, int end){
        int a=((~0) << st-1);
        int b=((1 << end));
        int bitMask = a | b;
        return n & bitMask;
    }
    static boolean checkPowerOfTwo(int n){
        return (n & (n-1))==0;
    }
    static int countSetBits(int n){
        int count =0;
        while(n > 0){
            count = (n & 1) == 1 ? count +1 : count;
            n = (n >> 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(getBit(n, sc.nextInt()));
        System.out.println(setBit(n, sc.nextInt()));
        System.out.println(clearBit(n, sc.nextInt()));
        System.out.println(updateBit(n, sc.nextInt(), sc.nextInt()));
        System.out.println(clearLastIBits(n, sc.nextInt()));
        System.out.println(clearRangeOfBits(n, sc.nextInt(), sc.nextInt()));
        System.out.println(checkPowerOfTwo(n));
        System.out.println(countSetBits(n));
    }
}