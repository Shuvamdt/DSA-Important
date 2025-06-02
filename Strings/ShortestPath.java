public class ShortestPath{
    public static int shortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='N'){
                y++;
            }else if(path.charAt(i)=='E'){
                x++;
            }else if(path.charAt(i)=='S'){
                y--;
            }else if(path.charAt(i)=='W'){
                x--;
            }else{
                System.out.println("Invalid path");
                return -1;
            }
        }
        return (int)Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("The shortest path is : "+shortestPath(path));
    }
}