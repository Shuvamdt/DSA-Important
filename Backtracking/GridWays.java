public class GridWays {
    public static int gridWays(int i, int j, int m, int n){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }
        int w1 = gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);

        return w1+w2;
    }
    public static int gridWaysTrick(int i, int j, int m, int n){
        return (factorial(n-1+m-1))/(factorial(n-1)*factorial(m-1));
    }
    public static int factorial(int n){
        int fact =1;
        for(int i=n ; i>0; i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int m=3, n=3;
        System.out.println(gridWaysTrick(0,0, m, n));
    }
}
