import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt() ;
        System.out.println((num & 1) == 0 ? "Even" : "Odd" );
    }
}
