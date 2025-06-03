import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char s1arr[] = s1.toCharArray();
        char s2arr[] = s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        for(int i=0; i<s1.length() ; i++){
            if(s1arr[i] != s2arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        if(isAnagram(s1, s2)){
            System.out.println("This two strings are anagrams");
        }else{
            System.out.println("This two strings are not anagrams");
        }
    }
}
