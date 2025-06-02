public class Palindrome {
    public static boolean isPalindrome(String str){
        String s = str.toLowerCase();
        int st=0, end = str.length()-1;
        while(st<=end){
            if(s.charAt(st)==s.charAt(end)){
                st++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "RaceCar";
        if(isPalindrome(str)){
            System.out.println("This is a palindrome"); 
        }else{
            System.out.println("This is not a palindrome");
        } 
    }
}
