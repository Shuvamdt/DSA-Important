public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println( 4 & 2);
        System.out.println(4 | 2);
        System.out.println(~4);
        System.out.println(4 ^ 2);
        // x << y == x * pow(2, y)
        System.out.println( 4 << 2);
        // x << y == x / pow(2, y)
        System.out.println( 4 >> 2);
    }
}
