import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int i=new Scanner(System.in).nextInt();
        int ans = 1;
        while(i > 0){
            if((i & 1)==1){
                ans = ans*n;
            }
            n = n * n;
            i = (i >> 1);
        }
        System.out.println(ans);
    }
}
